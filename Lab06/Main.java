package Lab06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice, data, afterData, deleteData;

        do {
            System.out.println("\n1. Insert at the beginning");
            System.out.println("2. Insert at the middle");
            System.out.println("3. Insert at the end");
            System.out.println("4. Delete first");
            System.out.println("5. Delete middle");
            System.out.println("6. Delete last");
            System.out.println("7. Traverse");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the beginning: ");
                    data = scanner.nextInt();
                    list.insertBegin(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    System.out.print("Enter the data of the node after which to insert: ");
                    afterData = scanner.nextInt();
                    list.insertMiddle(data, afterData);
                    break;
                case 3:
                    System.out.print("Enter data to insert at the end: ");
                    data = scanner.nextInt();
                    list.insertEnd(data);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    System.out.print("Enter data to delete: ");
                    deleteData = scanner.nextInt();
                    list.deleteMiddle(deleteData);
                    break;
                case 6:
                    list.deleteLast();
                    break;
                case 7:
                    System.out.println("Linked list elements:");
                    list.traverse();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);
        scanner.close();
    }
}
