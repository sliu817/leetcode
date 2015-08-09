package index1;

import java.util.Arrays;

/**
 * Created by yduan on 2/11/15.
 */
public class Candy {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);

        for (int i = 1; i< ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                candy[i] = candy[i - 1] + 1;
        }

        for (int i = ratings.length - 1; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1])
                candy[i] =  candy[i + 1] + 1;
        }

        int result = 0;
        for (int val : candy) {
            result += val;
        }
        return result;

    }
}
