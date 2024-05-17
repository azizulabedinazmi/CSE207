package Lab05;

public class MatrixOperations {
    public int[][] add(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int[][] sum = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        return sum;
    }

    public int[][] subtract(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int[][] subtraction = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                subtraction[i][j] = a[i][j] - b[i][j];
            }
        }

        return subtraction;
    }

    public int[][] multiply(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int p = b.length;
        int q = b[0].length;

        if (n != p) {
            throw new IllegalArgumentException("Matrices cannot be multiplied due to incompatible dimensions.");
        }

        int[][] multiplication = new int[m][q];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < p; k++) {
                    multiplication[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return multiplication;
    }

    public int[][] transpose(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = a[i][j];
            }
        }

        return result;
    }

    public void displayMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
