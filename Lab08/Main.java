package Lab08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();

        // Insertion
        System.out.println("Enter number of elements to insert:");
        int numElements = scanner.nextInt();
        System.out.println("Enter elements to insert:");
        for (int i = 0; i < numElements; i++) {
            int data = scanner.nextInt();
            queue.insert(data);
        }

        // Display
        queue.display();

        // Deletion
        System.out.println("Do you want to delete an element? (Y/N)");
        char choice = scanner.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            queue.delete();
            queue.display();
        }

        scanner.close();
    }
}
