package index1;

/**
 * Created by yduan on 2/6/15.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0, i = 0, j = height.length - 1;

        while (i < j) {
            int water = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(water, max);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}
