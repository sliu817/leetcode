package index3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yduan on 1/28/15.
 */
public class SurroundedRegions {
    public void solve (char[][] board) {
        if (board == null || board.length <= 1 || board[0].length <= 1) return;

        for (int i = 0; i < board[0].length; i++) {
            fill(board, 0, i);
            fill(board, board.length - 1, i);
        }

        for (int i = 0; i < board.length; i++) {
            fill(board, i, 0);
            fill(board, i, board[0].length - 1);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == '#')
                    board[i][j] = 'O';
            }
        }
    }

    private void fill (char[][] board, int i, int j) {
        if (board[i][j] != 'O')
            return;
        board[i][j] = '#';
        Queue<Pair> queue = new LinkedList<Pair>();
        Pair index = new Pair(i, j);
        queue.add(index);

        int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        while (!queue.isEmpty()) {
            index = queue.poll();

            for (int[] d: dir) {
                int row = index.row + d[0];
                int col = index.col + d[1];
                if (row >= 0 && row < board.length && col >= 0 && col < board[0].length &&
                        board[row][col] == 'O') {
                    queue.add(new Pair(row, col));
                    board[row][col] = '#';
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        char[][] board1 = {{'O', 'O'}, {'O', 'O'}};
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        for (int i = 0; i< board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                System.out.print(board[i][j] + " " );

    }
}
class Pair {
    int row;
    int col;
    public Pair(int r, int c) {
        row = r;
        col = c;
    }
}
