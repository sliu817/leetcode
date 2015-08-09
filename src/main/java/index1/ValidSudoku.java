package index1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by yduan on 1/27/15.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();

        for (int i = 0; i < board.length; i++) {
            set.clear();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.')
                    if (set.contains(board[i][j])) return false;
                set.add(board[j][i]);
            }
        }


        for (int i = 0; i < board.length; i++) {
            set.clear();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.')
                    if (set.contains(board[j][i])) return false;
                set.add(board[j][i]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                set.clear();
                for (int m = 3 * i; m < 3 * i + 3; m++) {
                    for (int n = 3 * j; n < 3 * j + 3; n++) {
                        if (board[m][n] != '.') {
                            if (set.contains(board[m][n])) return false;
                            set.add(board[m][n]);
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean valid(char[] chars) {
        HashSet<Character> set = new HashSet<Character>();
        for (Character ch: chars) {
            if (ch != '.') {
                if (set.contains(ch)) {
                    return false;
                }
                set.add(ch);
            }
        }

        return true;
    }

}
