package example3;

public class Node<T> {
    public T data;
    public int index;
    public Node<T> next;
    public Node<T> prev;
    public Node(T data) {
        this.data = data;
    }
}
