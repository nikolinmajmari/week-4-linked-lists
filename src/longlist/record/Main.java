package longlist.record;

import example3.DoubleLinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        {
            list.add(0,1);
            list.add(0,2);
            list.add(0,2);
            list.add(1,3);
            list.add(2,3);
            list.add(4,3);
        }
        System.out.printf("list=%s should be []\n", Arrays.toString(list.toArray()));
    }
}
