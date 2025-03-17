package example2;

import java.util.List;
public class MyList<T> {

    public Node<T> head;

    /**
     * Calculates size of the list
     * @return
     */
    public int size() {
        int size = 0;
        Node<T> current = head;
        while(current != null) {
            size++;
            current = current.link;
        }
        return size;
    }
    public boolean isEmpty() {
        return size()==0;
    }

    /**
     * checks whenever param object is contained in list
     * should use method equals
     * @param o
     * @return
     */
    public boolean contains(Object o) {
        Node<T> current = head;
        while(current != null) {
            if(current.data.equals(o)) {
                return true;
            }
            current = current.link;
        }
        return false;
    }
    public Object[] toArray() {
        Object[] array = new Object[size()];
        Node<T> current = head;
        for(int i = 0; i < size(); i++) {
            array[i] = current.data;
            current = current.link;
        }
        return array;
    }
    public T get(int index) {
        Node<T> current = head;
        for(int i = 0; i < size(); i++) {
            if(current.data.equals(index)) {
                return current.data;
            }
        }
        return null;
    }
    public void append(T data)
    {
        if(head == null) {
            head = new Node<>(data);
        }else{
            Node<T> current = head;
            while(current.link != null) {
                current = current.link;
            }
            current.link = new Node<>(data);
        }
    }
    public boolean removeAt(int index){
        Node<T> previous = null;
        Node<T> current = head;
        for(int i = 0; current!=null; i++) {
            if(i==index) {
                if(previous == null) {
                    head = current.link;
                }else {
                    previous.link = current.link;
                }
                return true;
            }
            previous = current;
            current = current.link;
        }
        return false;
    }

    public boolean insertAt(int index, T data){
        Node<T> current = head;
        Node<T> previous = null;
        Node<T> newNode = new Node<>(data);
        for(int i = 0; current!=null; i++) {
            if(i==index) {
                if(previous == null) {
                    newNode.link = head;
                    head = newNode;
                }else {
                    previous.link = newNode;
                    newNode.link = current;
                }
                return true;
            }
            previous = current;
            current = current.link;
        }
        if (previous!=null){
            previous.link = newNode;
            return true;
        }
        return false;
    }
    public int indexOf(Object o){
        Node<T> current = head;
        for(int i = 0; current!=null; i++) {
            if(current.data.equals(o)) {
                return i;
            }
            current = current.link;
        }
        return -1;
    }
    public int lastIndexOf( T data){
        int lastIndex = -1;
        Node<T> current = head;
        for(int i = 0; current!=null; i++) {
            if(current.data.equals(data)) {
                lastIndex = i;
            }
            current = current.link;
        }
        return lastIndex;
    }
}
