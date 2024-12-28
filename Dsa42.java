import java.util.ArrayList;
import java.util.List;

public class Dsa42 {

    public static List<String> findWords(char[][] board, String[] words) {
        List<String> name = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (exist(board, words[i])) {
                name.add(words[i]);
            }
        }

        for (String string : name) {
            System.out.println(string);
        }
        return name;
    }

    public static boolean backtrack(char[][] board, String word, int index, int row, int col) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = backtrack(board, word, index + 1, row + 1, col) ||
                backtrack(board, word, index + 1, row - 1, col) ||
                backtrack(board, word, index + 1, row, col + 1) ||
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
        char[][] board = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
                { 'i', 'f', 'l', 'v' } };
        String[] words = { "oath", "pea", "eat", "rain" };

        List<String> list = findWords(board, words);
        for (String string : list) {
            System.out.println(string);
        }
    }
}
