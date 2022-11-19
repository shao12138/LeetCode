package Offer;

import java.util.ArrayList;
import java.util.List;

public class PathSum_34 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, new ArrayList<>(), 0, targetSum);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> path, int sum, int targetSum) {
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null && root.val + sum == targetSum) {
            res.add(new ArrayList<>(path));
        }
        dfs(root.left, path, sum + root.val, targetSum);
        dfs(root.right, path, sum + root.val, targetSum);
        path.remove(path.size() - 1);
    }
}
