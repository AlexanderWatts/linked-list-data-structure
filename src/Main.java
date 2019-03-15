import linkedlist.Node;

public class Main {

    public static void main(String[] args) {

        //Linked list data structure
        Node<Integer> linkedList = new Node<>(12, new Node<>(13, null));

        Node<Integer> newNode = linkedList.addFront(11);

        System.out.println(newNode.getTail().getTail().getData());



    }

}
