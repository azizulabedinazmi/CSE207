package Lab01;

public class LinearSearchAlgorithm {
    // member variable
    int[] data;

    // constructor
    public LinearSearchAlgorithm(int[] data) {
        this.data = data;
    }

    public void linearSearch(int item) {
        boolean found = false;
        int location = -1;
        for (int i = 0; i < data.length; i++) {
            if (item == data[i]) {
                found = true;
                location = i;
                break;
            }
        }
        if (found == true) {
            System.out.println(item + " found in location: " + location);
        } else {
            System.out.println("Not found");
        }
    }
}