public class Dsa41 {
    public static boolean backtrack(char[][] board, String word, int index, int row, int col) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length
                || board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = backtrack(board, word, index + 1, row, col + 1) ||
                backtrack(board, word, index + 1, row + 1, col) ||
                backtrack(board, word, index + 1, row - 1, col) ||
                backtrack(board, word, index + 1, row, col - 1);

        board[row][col] = temp;
        return found;
    }

    public static boolean exist(char[][] board, String word) {
        if (board.length == 0 || word == "") {
            return false;
        }

        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (backtrack(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

        System.out.println(exist(board, "ABCB"));
    }
}
