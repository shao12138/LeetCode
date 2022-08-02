package SuanFa_RuMen;

public class MaxDepth_104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int lh = maxDepth(root.left);           //返回左子树的高度
        int rh = maxDepth(root.right);          //返回右子树的高度
        return (lh >= rh) ? lh + 1 : rh + 1;
    }
}
