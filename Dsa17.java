// Java code to find max element in a matrix
public class Dsa17 {

    public static int findMax(int mat[][]) {
        int maxElement = Integer.MIN_VALUE;
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (maxElement < mat[i][j]) {
                    maxElement = mat[i][j];
                }
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 23 },
                { 3, 33, 64, 9 },
                { 22, 95, 59, 81 },
                { 23, 52, 0, 20 }
        };

        System.out.println("Maximum element in matrix is " + findMax(mat));
    }
}
