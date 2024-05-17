package Lab09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for factorial calculation:");
        int num = scanner.nextInt();
        System.out.println("Factorial: " + Calculate.factorial(num));

        System.out.println("Enter a number for fibonacci calculation:");
        num = scanner.nextInt();
        System.out.println("Fibonacci: " + Calculate.fibonacci(num));

        System.out.println("Printing numbers 1 to 100 in reverse order:");
        Calculate.printReverse(100);

        System.out.println("\nPrinting 'JAVA' 100 times:");
        Calculate.printJava(100);

        System.out.println("\nEnter a word to check if it's a palindrome:");
        String word = scanner.next();
        System.out.println("Is Palindrome: " + Calculate.isPalindrome(word, 0, word.length() - 1));
        scanner.close();
    }
}