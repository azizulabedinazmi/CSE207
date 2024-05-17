package Lab10;

public class TreeTraversal {
    // Inorder Traversal
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.lchild);
            System.out.print(root.data + " ");
            inorder(root.rchild);
        }
    }

    // Preorder Traversal
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.lchild);
            preorder(root.rchild);
        }
    }

    // Postorder Traversal
    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.lchild);
            postorder(root.rchild);
            System.out.print(root.data + " ");
        }
    }
}