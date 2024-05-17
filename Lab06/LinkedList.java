package Lab06;

public class LinkedList {
    Node start;

    LinkedList() {
        start = null;
    }

    // Insertion at the beginning
    void insertBegin(int data) {
        Node newNode = new Node(data);
        if(start == null) {
            start = newNode;
            return;
        }
        else {
            newNode.next = start;
            start = newNode;
        }
    }

    // Insertion at the middle after a specified nodea
    void insertMiddle(int data, int afterData) {
        Node newNode = new Node(data);
        Node p = start;
        while (p != null && p.data != afterData) {
            p = p.next;
        }
        if (p != null) {
            newNode.next = p.next;
            p.next = newNode;
        } else {
            System.out.println("Node with specified data not found.");
        }
    }

    // Insertion at the end
    void insertEnd(int data) {
        Node newNode = new  Node(data);
        if (start == null) {
            start = newNode;
            return;
        }
        Node p = start;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
    }

    // Deletion of the first node
    void deleteFirst() {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        start = start.next;
    }

    // Deletion of a specified node
    void deleteMiddle(int data) {
        Node p = start;
        Node prev = null;

        if (p != null && p.data == data) {
            start = p.next;
            return;
        }

        while (p != null && p.data != data) {
            prev = p;
            p = p.next;
        }

        if (p == null) {
            System.out.println("Node with specified data not found.");
            return;
        }

        prev.next = p.next;
    }

    // Deletion of the last node
    void deleteLast() {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        Node p = start;
        Node prev = null;

        while (p.next != null) {
            prev = p;
            p = p.next;
        }

        if (prev == null) {
            start = null;
        } else {
            prev.next = null;
        }
    }

    // Traversal
    void traverse() {
        Node p = start;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
}
