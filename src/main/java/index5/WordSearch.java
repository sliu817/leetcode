package index5;

/**
 * Created by yduan on 1/27/15.
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0)
            return true;
        char ch = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ch) {
                    board[i][j] = ' ';
                    if (dfs(board, i, j, word, 1)) {
                        return true;
                    }
                    board[i][j] = ch;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, int row, int col, String word, int k) {
        if (k == word.length())
            return true;

        int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        char ch = word.charAt(k);
        int m = board.length;
        int n = board[0].length;

        for (int[] d : dir) {
            int i = row + d[0];
            int j = col + d[1];
            if (i >= 0 && i < m && j >= 0 && j < n && board[i][j] == ch) {
                board[i][j] = ' ';
                if (dfs(board, i, j, word, k + 1)) {
                    return true;
                }
                board[i][j] = ch;
            }
        }
        return false;
    }
}
