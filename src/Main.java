import linkedlist.Node;

public class Main {

    public static void main(String[] args) {

        //Linked list data structure
        Node<Integer> linkedlist = new Node<>(12, new Node<>(13, null));

        //Tests
        System.out.println(linkedlist.getData());
        System.out.println(linkedlist.getTail().getData());

    }

}
