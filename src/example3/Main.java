package example3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        {
            list.add(0,1);
            list.add(0,2);
            list.add(1,3);
            list.add(1,3);
            list.add(2,2);
            list.add(20,1);
        }
        System.out.printf("list=%s should be []\n", list);
        System.out.printf("calling list.removeAt(2)=%d\n",list.removeAt(2));
        System.out.printf("list=%s\n",list);
        System.out.println("calling list.remove(3)");
        list.remove(3);
        System.out.printf("list=%s\n",list);

        DoubleLinkedList<Integer> other = new DoubleLinkedList<>();
        other.add(0,1);
        other.add(1,2);
        other.add(1,4);
        System.out.printf("other list is %s\n", other);
        System.out.printf("list.containsAll(other)=%b\n", list.containsAll(other));
        System.out.println("remove 4 from other");
        other.remove(4);
        System.out.printf("list=%s\n",list);
        System.out.printf("other=%s\n",other);
        System.out.printf("list.containsAll(other)=%b\n", list.containsAll(other));
        System.out.println("adding other to list");
        list.addAll(other);
        System.out.printf("list=%s\n",list);
        System.out.println("removing other from list");
        list.removeAll(other);
        System.out.printf("list=%s\n",list);

    }
}
