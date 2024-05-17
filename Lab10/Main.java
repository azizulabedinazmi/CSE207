package Lab10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Manual input of tree data
        System.out.println("Enter the root value:");
        int rootValue = scanner.nextInt();
        Node root = new Node(rootValue);

        System.out.println("Enter the left child value of the root (or -1 if none):");
        int leftValue = scanner.nextInt();
        if (leftValue != -1) {
            root.lchild = new Node(leftValue);
        }

        System.out.println("Enter the right child value of the root (or -1 if none):");
        int rightValue = scanner.nextInt();
        if (rightValue != -1) {
            root.rchild = new Node(rightValue);
        }

        // Inorder Traversal
        System.out.println("Inorder Traversal:");
        TreeTraversal.inorder(root);
        System.out.println();

        // Preorder Traversal
        System.out.println("Preorder Traversal:");
        TreeTraversal.preorder(root);
        System.out.println();

        // Postorder Traversal
        System.out.println("Postorder Traversal:");
        TreeTraversal.postorder(root);
        System.out.println();

        scanner.close();
    }
}
