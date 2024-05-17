package Lab05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix A: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix A: ");
        int n = scanner.nextInt();
        int[][] a = new int[m][n];

        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of rows of matrix B: ");
        int p = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix B: ");
        int q = scanner.nextInt();
        int[][] b = new int[p][q];

        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        MatrixOperations matrixOps = new MatrixOperations();

        System.out.println("\nMatrix A:");
        matrixOps.displayMatrix(a);
        System.out.println("Matrix B:");
        matrixOps.displayMatrix(b);

        int[][] sum = matrixOps.add(a, b);
        System.out.println("Addition of matrices:");
        matrixOps.displayMatrix(sum);

        int[][] subtraction = matrixOps.subtract(a, b);
        System.out.println("Subtraction of matrices:");
        matrixOps.displayMatrix(subtraction);

        int[][] multiplication = matrixOps.multiply(a, b);
        System.out.println("Multiplication of matrices:");
        matrixOps.displayMatrix(multiplication);

        System.out.println("Transpose of matrix A:");
        int[][] transposeA = matrixOps.transpose(a);
        matrixOps.displayMatrix(transposeA);

        System.out.println("Transpose of matrix B:");
        int[][] transposeB = matrixOps.transpose(b);
        matrixOps.displayMatrix(transposeB);
        scanner.close();
    }
}
