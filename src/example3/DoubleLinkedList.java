package example3;

import java.util.Arrays;
import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T> {
    protected Node<T> head = null;
    protected Node<T> tail = null;

    public int size() {
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public boolean contains(Object o) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; current!=null; i++) {
            if(index==i){
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
    public T set(int index, T element) {
        Node<T> current = head;
        for (int i = 0; current!=null; i++) {
            if(index==i){
                current.data = element;
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
    public boolean add(int index, T element) {
        Node<T> newNode = new Node<>(element);
        Node<T> current = head;
        for (int i = 0; current!=null; i++) {
            if(index==i){
                if(current.prev!=null){
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev.next = newNode;
                    current.prev = newNode;
                } else {
                    newNode.next = current;
                    current.prev = newNode;
                    head = newNode;
                }
                return true;
            }
            current = current.next;
        }
        /// append node
        if (head==null) {
            head = newNode;
            tail = newNode;
            return true;
        }else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            return true;
        }
    }
    public T removeAt(int index) {
        Node<T> current = head;
        for (int i = 0; current!=null; i++) {
            if(index==i){
                if (current.prev!=null && current.next!=null){
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                } else if (current.prev==null&&current.next==null) {
                    head = null;
                    tail = null;
                } else if ( current.prev==null) {
                    head = current.next;
                    head.prev = null;
                }else {
                    tail = current.prev;
                    tail.next =null;
                }
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(T item) {
        Node<T> current = head;
        for (int i = 0; current!=null; i++) {
            if(current.data.equals(item)){
                if (current.prev!=null && current.next!=null){
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                } else if (current.prev==null&&current.next==null) {
                    head = null;
                    tail = null;
                } else if ( current.prev==null) {
                    head = current.next;
                    head.prev = null;
                }else {
                    tail = current.prev;
                    tail.next =null;
                }
                return;
            }
            current = current.next;
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new DoubleLinkedListIterator<>(head);
    }

    public Object[] toArray() {
        Object[] array = new Object[size()];
        Node<T> current = head;
        for (int i = 0; current!=null; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }

    public boolean containsAll(DoubleLinkedList<T> other) {
        for (Object o : other) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(DoubleLinkedList<T> other) {
        tail.next = other.head;
        tail = other.tail;
        return true;
    }

    public boolean addAll(int index, DoubleLinkedList<T> other) {
        Node<T> current = head;
        for (int i = 0; current!=null; i++) {
            if(index==i){
                if (current.prev==null){
                    head = other.head;
                    other.tail = current;
                    current.prev = other.tail;
                }else if(current.next==null){
                    tail.next = other.head;
                    other.head.prev = tail;
                    tail = other.tail;
                }else{
                    current.prev.next = other.head;
                    other.head.prev = current.prev;
                    other.tail.next = current;
                    current.prev = other.tail;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeAll(DoubleLinkedList<T> other) {
        for (T o : other) {
            while (contains(o)){
                remove(o);
            }
        }
    }

    public void retainAll(DoubleLinkedList<T> other) {
        for (T o : this) {
            while (!other.contains(o)) {
                remove(o);
            }
        }
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public DoubleLinkedList<T> subList(int fromIndex, int toIndex) {
        DoubleLinkedList<T> list = new DoubleLinkedList<>();
        int index = 0;
        Node<T> current = head;
        while (current!=null) {
            if (index>=fromIndex&&index<=toIndex){
                list.add(index-fromIndex,current.data);
            }
            index++;
            current = current.next;
        }
        return list;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }
}

class DoubleLinkedListIterator<T> implements Iterator<T>{

    private Node<T> current;

    DoubleLinkedListIterator(Node<T> current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current!=null;
    }

    @Override
    public T next() {
        T element = current.data;
        current = current.next;
        return element;
    }
}
