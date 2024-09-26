package topic_2_linkedlist_string;

public class LinkedList {

    private Node head;

    // Method to add a new node at the end of the list
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    //Method to print the linked list
    public void printlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    // Method to move a node to a new position /swap nodes

    public void moveNodePointer(int currentIndex, int newIndex) {
        if (head == null || currentIndex == newIndex) {
            return;
        }

        Node current = head;
        Node prev = null;
        Node movingNode = null;
        Node movingPrev = null;

        // Find the node to move
        for (int i = 0; current != null && i < currentIndex; i++) {
            movingPrev = prev;
            prev = current;
            current = current.next;
        }
        movingNode = current;

        // If the node to move was not found
        if (movingNode == null) {
            return;
        }

        // Remove the node from its current position
        if (movingPrev != null) {
            movingPrev.next = movingNode.next;
        } else {
            // Moving the head
            head = movingNode.next;
        }

        // Insert the node at the new position
        current = head;
        prev = null;
        for (int i = 0; current != null && i < newIndex; i++) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            movingNode.next = current;
            prev.next = movingNode;
        } else {
            movingNode.next = head;
            head = movingNode;
        }
    }

}
