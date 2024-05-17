package Lab07;

public class Main {
    public static void main(String[] args) {
        StackOperations stack = new StackOperations();

        // Perform manual push and pop operations
        stack.push();
        stack.push();
        stack.push();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // This will demonstrate stack underflow
    }
}
