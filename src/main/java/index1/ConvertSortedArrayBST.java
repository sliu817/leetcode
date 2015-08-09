package index1;

import model.TreeNode;

/**
 * Created by yduan on 2/6/15.
 */
public class ConvertSortedArrayBST {
    public TreeNode sortedArrayToBST(int[] num) {
        return createBST(num, 0, num.length- 1);
    }

    private TreeNode createBST (int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = createBST(arr, start, mid - 1);
        node.right = createBST(arr, mid + 1, end);

        return node;
    }
}
