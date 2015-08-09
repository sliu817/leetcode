package index3;

/**
 * Created by yduan on 2/12/15.
 */
public class MajorityElement {
    public int majorityElement(int[] num) {

        int candidate = num[0], count = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = num[i];
                count = 1;
            }
        }
        return candidate;
    }

    public int majorityElementPartition(int[] num) {
        int pivot = num[num.length - 1];
        int left = 0, right = pivot - 1;
        while (left <= right) {
            if (num[left] < pivot) {
                left++;
            } else {
                swap(num, left, right);
                right--;
            }
        }
        swap(num, left, num.length - 1);
        return num[num.length/2];
    }
    private void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}
