package example1;

public class Example1 {

    public static <T>void print(Node<T> node) {
       Node<T> current = node;
       while(current != null) {
           System.out.print(current.data + " ");
           current = current.link;
       }
    }

    public static <T>void printRecursively(Node<T> node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        printRecursively(node.link);
    }

    public static <T>void printInReverse(Node<T> node){
        if(node == null){
            return;
        }
        printInReverse(node.link);
        System.out.print(node.data + " ");
    }

    public static <T>void append(Node<T> node, T data){
        // todo your code here
        Node<T> newNode = new Node<>(data);
        Node<T> current = node;
        while(current.link != null){
            current = current.link;
        }
        current.link = newNode;

    }

    public static void main(String[] args) {
        Node<Integer> head;
        head = new Node<>(1);
        head.link = new Node<>(2);
        head.link.link = new Node<>(3);
        head.link.link.link = new Node<>(4);
        head.link.link.link.link = new Node<>(5);
        head.link.link.link.link.link = new Node<>(6);

        System.out.println("\nNormal print---------\n");
        print(head);
        System.out.println("\nRecursively print---------\n");
        printRecursively(head);
        System.out.println("\nReverse print---------\n");
        printInReverse(head);
        System.out.println("\nAppend 7 and print---------\n");
        append(head,7);
        print(head);
    }
}
