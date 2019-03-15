import linkedlist.Node;

public class Main {

    public static void main(String[] args) {

        //Linked list data structure
        Node<Integer> linkedList = new Node<>(12, new Node<>(13, new Node<>(14, new Node<>(15, null))));

        Node<Integer> newNode = linkedList.addFront(11);

        newNode.printAll();

        Node<String> linkedListString = new Node<>("I", new Node<>("am", new Node<>("Groot", null)));

        linkedListString.printAll();


    }

}
