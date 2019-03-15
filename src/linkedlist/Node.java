package linkedlist;

public class Node<T> {

    private T data;
    private Node<T> tail;

    /**
     * A node must store a data value i.e. an integer like 16
     * It must also have a tail which can be another node
     * but can also be null to mark the end of the linked list
     * @param data A data value stored in a node
     * @param tail The next node in the linked list
     */
    public Node(T data, Node<T> tail) {
        this.data = data;
        this.tail = tail;
    }

    /**
     * @return data The data stored in the node
     */
    public T getData() {
        return data;
    }

    /**
     * @return tail A nodes tail
     */
    public Node<T> getTail() {
        return tail;
    }

}
