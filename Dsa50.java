// Input: matrix = 
// [[1,2,3]
// ,[4,5,6],
//  [7,8,9]]

// Output: 
// [[7,4,1],
// [8,5,2],
//  [9,6,3]]

// 00 01 02
// 10 11 12
// 20 21 22

// 20 10 00
// 21 11 01
// 22 12 02

public class Dsa50 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = matrix[n - 1 - j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = mat[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
