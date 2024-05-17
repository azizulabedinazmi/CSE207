package Lab07;

import java.util.Scanner;

public class StackOperations {
    private Node top;
    private Scanner scanner;

    public StackOperations() {
        this.top = null;
        this.scanner = new Scanner(System.in);
    }

    public void push() {
        System.out.print("Enter data to push: ");
        int data = scanner.nextInt();
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Data pushed: " + data);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            int poppedData = top.data;
            top = top.next;
            System.out.println("Popped data: " + poppedData);
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}
