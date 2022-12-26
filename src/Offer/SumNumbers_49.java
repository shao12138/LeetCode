package Offer;

public class SumNumbers_49 {

    int sum = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root);
        return sum;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        sum += root.val;
        dfs(root.left);
        dfs(root.right);
    }
}
