package Lab02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[] data = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " +data.length+ " items = ");
        for (int i = 0 ; i < 10; i++){
            data[i] = input.nextInt();
        }
        BinarySearch search = new BinarySearch(data);
        System.out.print("Enter the item you want to search : ");
        int item = input.nextInt();
        search.PrintData();
        int index = search.binarySearch(item);
        if (index != -1) {
            System.out.println("\nItem found at index : " +index); 
        } else{
            System.out.println("\nItem not found");
        }
        input.close();
    }
}