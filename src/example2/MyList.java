package example2;

import java.util.List;
public class MyList<T> {

    public Node<T> head;

    /**
     * Calculates size of the list
     * @return
     */
    public int size() {
        Node<T> current = head;
        int counter= 0;
        while(current != null){
            current=current.link;
            counter++;
        }
        return counter;
    }

    public boolean isEmpty() {
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
        while(current!=null){
            if(o.equals(current.data)){
                return true;
            }
            current=current.link;

        }
        return false;
    }
    public Object[] toArray() {
        Object[] result = new Object[size()];
        Node<T> current = head;
        int i = 0;
        while (current != null) {
            result[i] = current.data;
            current=current.link;
            i++;
        }
//        for(int index=0;current!=null;index++){
//            result[index] = current.data;
//            current=current.link;
//        }

        return result;
    }
    public T get(int index) {
        Node<T> current = head;
        int i = 0;
        while (current != null) {
            if(i==index){
             return current.data;
            }
            i++;
            current = current.link;
        }
        return null;
    }
    public void append(T data)
    {
        if (head == null) {
            head = new Node<>(data);
            return;
        }
        Node<T> newNode = new Node<>(data);
        Node<T> current = head;
        while(current.link!=null){
            current = current.link;
        }
        current.link = newNode;
    }
    public boolean removeAt(int index){
      if(head==null){
          return false;
      }
       if(index==0){
           head=head.link;
           return true;
       }
        Node<T> current = head;
        int i=0;

        while(current.link!=null){
            if(i==index-1){
                current.link=current.link.link;
                return true;
            }
            i++;
            current = current.link;
        }
        return false;
    }

    public boolean insertAt(int index, T data){
        if(index==0){
            Node<T> newNode = new Node<>(data);
            newNode.link=head;
            head=newNode;
            return true;
        }
        int i=0;
        Node<T> current = head;
        while(current.link!=null){
            if(i==index-1){
                Node<T> newNode = new Node<>(data);
                newNode.link=current.link;
                current.link=newNode;
                return true;
            }
        }
        return false;
    }
    public int indexOf(Object o){
        Node<T> current = head;
        int i = 0;
        while(current!=null){
            if(o.equals(current.data)){
                return i;
            }
            i++;
        }
        return -1;
    }
    public int lastIndexOf( T o){
        Node<T> current = head;
        int lastIndex = -1;
        int i = 0;
        while(current!=null){
            if(o.equals(current.data)){
                lastIndex = i;
            }
            i++;
        }
        return lastIndex;
    }
}
