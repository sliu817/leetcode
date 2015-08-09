package index1;

/**
 * Created by yduan on 2/3/15.
 */
public class JumpGame {
    public boolean canJump (int[] A) {
        int maxPos = 0;
        for (int i = 0; i <= maxPos; i++) {  ////i <= maxPos
            maxPos = Math.max(maxPos, i + A[i]);
            if (maxPos >= A.length - 1)
                return true;
        }
        return false;
    }
}
