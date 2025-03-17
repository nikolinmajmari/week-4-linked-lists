package example3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DoubleLinkedList<T> implements Iterable<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

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
        int i = 0;
        while (current!=null) {
            if (i==index) {
                current.data = element;
                return current.data;
            }
            current = current.next;
            i++;
        }
        return null;
    }
    public void add(int index, T element) {
        Node<T> newNode = new Node<>(element);
        if(index==0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
        Node<T> current = head;
        int i = 0;
        while (current!=null) {
            if(i==index){
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
                return;
            }
            current = current.next;
            index++;
        }
        return;
    }
    public T removeAt(int index) {
        // todo your code here
        return null;
    }

    public T remove(T item) {
        // todo your code here
        return null;
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
        // todo your code here
        return false;
    }

    public boolean addAll(DoubleLinkedList<T> other) {
        if(head==null){
            head = other.head;
            tail = other.tail;
        }
        if (other.head==null){
            return true;
        }
        else {
            tail.next = other.head;
            other.head.prev = tail;
            tail = other.tail;
        }
        return true;
    }

    public boolean addAll(int index, DoubleLinkedList<T> other) {

        return false;
    }

    public void removeAll(DoubleLinkedList<T> other) {
        // todo your code here
    }

    public void retainAll(DoubleLinkedList<T> other) {
        // todo your code here
    }

    public void clear() {
        // todo your code here
    }

    public DoubleLinkedList<T> subList(int fromIndex, int toIndex) {
        return new DoubleLinkedList<T>();
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
       T result = current.data;
       current = current.next;
       return result;
    }
}
