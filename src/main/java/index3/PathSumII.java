package index3;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yduan on 1/30/15.
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        pathSumHelper(root, sum, res, path);
        return res;
    }

    public void pathSumHelper(TreeNode node, int sum, List<List<Integer>> res, List<Integer> path) {
        if (node == null) return;
        if (node.left == null && node.right == null && node.val == sum) {
            res.add(new ArrayList<Integer>(path));
        }
        pathSumHelper(node.left, sum - node.val, res, path);
        pathSumHelper(node.right, sum - node.val, res, path);

        path.remove(path.size() - 1);
    }

}
