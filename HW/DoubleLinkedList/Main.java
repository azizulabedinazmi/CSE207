
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insertLast(data);
        }

        System.out.println("Original list:");
        list.display();

        System.out.println("Enter data to insert at first:");
        int firstData = scanner.nextInt();
        list.insertFirst(firstData);
        System.out.println("List after inserting at first:");
        list.display();

        System.out.println("Enter data to insert at last:");
        int lastData = scanner.nextInt();
        list.insertLast(lastData);
        System.out.println("List after inserting at last:");
        list.display();

        System.out.println("Enter data to insert at middle:");
        int middleData = scanner.nextInt();
        System.out.println("Enter position to insert at middle:");
        int position = scanner.nextInt();
        list.insertMiddle(middleData, position);
        System.out.println("List after inserting at middle:");
        list.display();

        System.out.println("Deleting first element:");
        list.deleteFirst();
        list.display();

        System.out.println("Deleting last element:");
        list.deleteLast();
        list.display();

        System.out.println("Enter position to delete from middle:");
        int deletePosition = scanner.nextInt();
        list.deleteMiddle(deletePosition);
        System.out.println("List after deleting from middle:");
        list.display();

        scanner.close();
    }
}
