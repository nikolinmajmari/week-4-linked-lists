package example3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        {
            list.head = new Node<>(1);
            list.head.next = new Node<>(2);
            list.head.next.prev = list.head;
            list.head.next.next = new Node<>(3);
            list.head.next.next.prev = list.head.next;
//            list.add(0,1);
//            list.add(0,2);
//            list.add(0,2);
//            list.add(1,3);
//            list.add(2,3);
//            list.add(4,3);
        }
        System.out.printf("list=%s should be []\n", Arrays.toString(list.toArray()));

        System.out.printf("list.set(1,100)=%d\n",list.set(1,100));
        System.out.printf("list.get(1)=%d\n",list.get(1));
    }
}
