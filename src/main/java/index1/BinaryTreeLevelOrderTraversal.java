package index1;

import model.TreeNode;

import java.util.*;

/**
 * Created by yduan on 2/11/15.
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrderBFS(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        Queue<TreeNode> queue = new LinkedList<>(Arrays.asList(root, null));
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode curr = queue.remove();
            if (curr != null) {
                list.add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            } else {
                ans.add(list);
                list = new ArrayList<>();
                if (queue.size() > 0) {
                    queue.add(null);
                }
            }
        }

        return ans;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfsPreOrder(root, 0, ans);
        return ans;
    }

    private void dfsPreOrder(TreeNode node, int depth, List<List<Integer>> ans) {
        if (node == null) {
            return;
        }

        if (depth >= ans.size()) {
            ans.add(new ArrayList<Integer>());
        }

        ans.get(depth).add(node.val);

        dfsPreOrder(node.left, depth + 1, ans);
        dfsPreOrder(node.right, depth + 1, ans);
    }

    private void dfsPostOrder(TreeNode node, int depth, List<List<Integer>> ans) {
        if (node == null) {
            return;
        }

        if (depth >= ans.size()) {
            ans.add(0, new ArrayList<Integer>());
        }

        ans.get(ans.size() - 1 - depth).add(node.val);

        dfsPostOrder(node.left, depth + 1, ans);
        dfsPostOrder(node.right, depth + 1, ans);
    }





}
