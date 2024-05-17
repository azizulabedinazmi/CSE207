package Lab02;

public class BinarySearch {
    int[] data;

    public BinarySearch(int[] data) {
        this.data = data;
    }

    public void PrintData() {
        System.out.println("The Data in the Array");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public int binarySearch(int item) {
        boolean found = false;
        int location = -1;
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (item == data[mid]) {
                found = true;
                location = mid;
                break;
            } else if (item < data[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return location;
    }

}
