package Lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[10];
        int n = data.length;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter " + n + " Values: ");
        for (int k = 0; k < n; k++) {
            data[k] = input.nextInt();
        }
        LinearSearchAlgorithm search = new LinearSearchAlgorithm(data);
        search.linearSearch(7);
        input.close();
    }
}
