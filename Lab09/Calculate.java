package Lab09;

public class Calculate {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void printReverse(int n) {
        if (n > 0) {
            System.out.print(" " +n);
            printReverse(n - 1);
        }
    }

    public static void printJava(int n) {
        if (n > 0) {
            System.out.print(" JAVA");
            printJava(n - 1);
        }
    }

    public static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        } else if (word.charAt(start) != word.charAt(end)) {
            return false;
        } else {
            return isPalindrome(word, start + 1, end - 1);
        }
    }
}