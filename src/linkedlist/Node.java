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

    /**
     * Add a node to the front of the list
     * This is a none destructive approach
     * meaning that the original list will be
     * unaffected
     * @param data A data value to be stored in the head node
     * @return A new linked list with a new head
     */
    public Node<T> addFront(T data) {
        return new Node<>(data, this);
    }

    /**
     * Add a node to the back of the linked
     * list recursively
     * @param data The data we want to add to the end node
     */
    public Node<T> addBack(T data) {

        //Check if the tail is null
        if(tail == null) {
            return tail = new Node<>(data, null);
        }

        //Recursively call the method
        //Until the tail is found to be null
        return tail.addBack(data);
    }

    /**
     * Print the data in the linked list
     * @return
     */
    public String printData() {

        // Check if there is only one item in the list
        //If so only print that data
        if(tail == null) {
            return "[" + data + "]";
        }

        //If there is more than one bit of
        //data in the list recursively call
        //the tailData method to get the
        //rest of the data
        return "[" + data + tail.tailData();

    }

    /**
     * tailData is needed for printing
     * all the data in a linked list
     * as seen in printData
     * Note: A linked list should not
     * call this method hence it
     * being private
     * @return str The formatted string
     */
    private String tailData() {

        //The main structure of the print i.e. ,2,3,]
        String str = "," + data;

        //When the tail is null
        //stop the recursion
        if(tail == null) {
            return str + "]";
        }

        //Keep concatenating to str
        //so that it stores all the data
        return str + tail.tailData();
    }


}
