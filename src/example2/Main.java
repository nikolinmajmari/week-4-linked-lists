package example2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        {
            list.head = new Node(1);
            list.head.link = new Node(2);
            list.head.link.link = new Node(3);
            list.head.link.link.link = new Node(4);
            list.head.link.link.link.link = new Node(5);
        } /// set on list 1,2,3,4,5

        System.out.printf("List size is %d\n", list.size());
        System.out.printf("List is empty : %b\n", list.isEmpty());
        System.out.printf("List.contains(1) = %b, list.contains(100)=%b\n",list.contains(1),list.contains(100));
        System.out.printf("list.toArray() = %s\n", Arrays.toString(list.toArray()));
        System.out.printf("list.get(1)=%d,  list.get(100)=%d\n", list.get(1), list.get(100));
        System.out.println("list.append(6)\n");
        list.append(6);
        /// list becomes 1,2,3,4,5,6
        System.out.printf("list.toArray() = %s\n", Arrays.toString(list.toArray()));
        /// remove at index 2
        System.out.println("remove at index 2\n");
        System.out.printf("removeAt(2)=%b\n",list.removeAt(2));
        /// list becomes 1,2,4,5,6
        System.out.printf("list.toArray() = %s\n", Arrays.toString(list.toArray()));
        /// insert at index 2;
        System.out.printf("list.insertAt(2,3)=%b\n",list.insertAt(2,3));
        System.out.printf("list.insertAt(2,3)=%b\n",list.insertAt(3,3));
        System.out.printf("list.insertAt(200,3)=%b\n",list.insertAt(200,3));
        /// list becomes 1,2,2,4,5,6
        System.out.printf("list.toArray() = %s\n", Arrays.toString(list.toArray()));
        System.out.printf("list.indexOf(3)=%d, should be 2\n",list.indexOf(3));
        System.out.printf("list.lastIndexOf(3)=%d should be 3\n",list.lastIndexOf(3));
    }

}
