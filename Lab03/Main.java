package Lab03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] data = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some data");
		for(int i=0;i<data.length;i++) {
			data[i] = input.nextInt();
		}
		BubbleSortingAlgorithm sort = new BubbleSortingAlgorithm(data);
		System.out.println("The array ");
		sort.BubbleSort();
        input.close();
	}

}