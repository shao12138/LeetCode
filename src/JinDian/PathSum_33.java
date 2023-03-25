package JinDian;

import java.util.ArrayList;
import java.util.List;

public class PathSum_33 {
    List<List<Integer>> res = new ArrayList<>();

    public int pathSum(TreeNode root, int sum) {
        dfs(root, new ArrayList<>(), 0, sum);
        return res.size();
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
