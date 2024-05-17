package Lab04;

public class SelectionSortingAlgorithm {
	int[] data;

	public SelectionSortingAlgorithm(int[] data) {
		this.data = data;
	}

	public void selectionSort() {
		for (int j = 0; j < data.length - 1; j++) {
			int minIndex = j;
			for (int i = j + 1; i < data.length; i++) {
				if (data[i] < data[minIndex]) {
					minIndex = i;
				}
			}
			int temp = data[minIndex];
			data[minIndex] = data[j];
			data[j] = temp;
			printArray();
		}
	}

	public void printArray() {
		System.out.println();
		for (int element : data) {
			System.out.print(element + " ");
		}
	}
}
