package SuanFa_100;

public class HasPathSum_112 {

    boolean ans = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        dfs(root, sum);
        return ans;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                ans = true;
            }
        }

        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);
    }
}
