package SuanFa_500;

public class DiameterOfBinaryTree_543 {
    private int ret = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        getMax(root);
        return ret-1;
    }

    private int getMax(TreeNode r) {
        if (r == null) return 0;
        int left = Math.max(0, getMax(r.left)); // 如果子树路径和为负则应当置0表示最大路径不包含子树
        int right = Math.max(0, getMax(r.right));
        ret = Math.max(ret, 1 + left + right); // 判断在该节点包含左右子树的路径和是否大于当前最大路径和
        return Math.max(left, right) + 1;
    }
}
