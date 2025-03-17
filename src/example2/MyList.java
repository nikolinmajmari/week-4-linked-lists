package example2;

import java.util.List;
public class MyList<T> {

    public Node<T> head;

    /**
     * Calculates size of the list
     * @return
     */
    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.link;
        }

        return count;
    }
    public boolean isEmpty() {
        // todo your code here
        return head == null;
    }

    /**
     * checks whenever param object is contained in list
     * should use method equals
     * @param o
     * @return
     */
    public boolean contains(Object o) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.link;
        }
        return false;
    }
    public Object[] toArray() {
        Object[] result = new Object[size()];
        Node<T> current = head;
        int i = 0;
        while (current != null) {
            result[i] = current.data;
            current = current.link;
            i++;
        }
        return  result;
    }
    public T get(int index) {
        // todo your code here
        Node<T> current = head;
        int i = 0;
        while (current != null) {
           if(i == index) {
               return current.data;
           }

            i++;
            current = current.link;
        }
        return null;
    }
    public void append(T data)
    {
        // todo your code here
    }
    public boolean removeAt(int index){
        // todo your code here
        if(index==0){
            head=head.link;
            return true;
        }
        int i = 0;
        Node<T> current = head;
        while(current.link!=null){
            if(i == index-1){
                current.link=current.link.link;
                return true;
            }
            current=current.link;
            i++;
        }

        return false;
    }

    public boolean insertAt(int index, T data){
        Node <T> newNode = new Node<>(data);
        if (index==0){
            newNode.link=head;
            head=newNode;
            return true;
        }
        Node<T> current = head;
        int i=0;
        while(current!=null){
            if(i==index-1){
                newNode.link=current.link;
                current.link=newNode;
                return true;
            }
            i++;
            current = current.link;
        }
        return false;
    }
    public int indexOf(Object o){
        int i=0;
        Node<T> current = head;
        while(current!=null){
            if(current.data.equals(o)){
                return i;
            }
            i++;
            current = current.link;
        }
        return 0;
    }
    public int lastIndexOf( T data){
        int lastIndex=-1;
        int i=0;
        Node<T> current = head;
        while(current!=null){
            if(current.data.equals(data)){
                lastIndex=i;
            }
            i++;
            current = current.link;
        }
        return lastIndex;
    }
}
