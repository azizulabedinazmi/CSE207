package Lab04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] data = new int[10];
		System.out.println("Enter some data");
		for (int i = 0; i < data.length; i++) {
			data[i] = input.nextInt();
		}
		SelectionSortingAlgorithm sort = new SelectionSortingAlgorithm(data);
		System.out.println("The array ");
		sort.selectionSort();
		input.close();
	}

}
