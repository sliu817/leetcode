package index3;

/**
 * Created by yduan on 1/30/15.
 */
public class QuickSortandFindTopK {

    public void quickSort(int[] a, int left, int right) {
        if (left > right) return;
        int p = partition(a, left, right);
        quickSort(a, left, p - 1);
        quickSort(a, p + 1, right);
    }

    private int partition(int[] a, int left, int right) {
        int pivot = a[right];
        int p = right;
        right = right - 1;
        while (left <= right) {
            if (a[left] <= pivot) {
                left++;
            } else {
                swap(a, left, right);
                right--;
            }
        }
        swap(a, left, p);
        return left;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void findTopK(int[] a, int left, int right, int k) {
        if (left > right) return;
        int p = partition(a, left, right);
        if (k == p) {
            for (int i = 0; i <= p; i++)
                System.out.print(a[i]);
        }
        else if (k < p)
            findTopK(a, left, p - 1, k);
        else
            findTopK(a, p + 1, right, k);
    }
}
