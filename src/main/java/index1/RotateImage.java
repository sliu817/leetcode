package index1;

/**
 * Created by yduan on 1/29/15.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for(int i = 0; i < (n + 1) / 2; i++) {
            for(int j = 0; j < (n + 2) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j][i];
                matrix[n - j][i] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j][n - i];
                matrix[j][n - i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        RotateImage r = new RotateImage();
        r.rotate(m);
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
    }
}
