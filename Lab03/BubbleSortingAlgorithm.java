package Lab03;

public class BubbleSortingAlgorithm {
    int[] data;
    int temp;

    public BubbleSortingAlgorithm(int[] data) {
        this.data = data;
    }
    
    public void BubbleSort() {
        for (int j=0; j<data.length-1; j++){
            for (int i=0; i<data.length-1-j; i++){ 
                if (data[i]>data[i+1]){
                    temp = data[i];
                    data[i]= data[i+1];
                    data[i+1]=temp;
                    printArray();
                }
            }
        }
    }
    
    public void printArray() {
        for(int element:data) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }
}