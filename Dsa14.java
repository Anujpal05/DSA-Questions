import java.util.Scanner;

public class Dsa14 {

    // 0 1 0 1
    // 0 0 1 0
    // 1 0 0 0

    public static int[][] boolMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {

                    // For Row mark -1 if value is 0
                    int ind = i - 1;
                    while (ind >= 0) {
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }

                    ind = i + 1;
                    while (ind < row) {
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }

                    // For Column mark -1 if value is 0
                    ind = j - 1;
                    while (ind >= 0) {
                        if (matrix[i][ind] != 1) {
                            matrix[i][ind] = -1;
                        }
                        ind--;
                    }

                    ind = j + 1;
                    while (ind < col) {
                        if (matrix[i][ind] != 1) {
                            matrix[i][ind] = -1;
                        }
                        ind++;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < 0) {
                    matrix[i][j] = 1;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int row, column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column respectevely :");
        row = sc.nextInt();
        column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter the element of array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println("\n");
        }

        int[][] boolMatrix = boolMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(boolMatrix[i][j] + " ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}
