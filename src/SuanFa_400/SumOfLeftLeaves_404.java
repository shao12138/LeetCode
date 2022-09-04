package SuanFa_400;

public class SumOfLeftLeaves_404 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        //sumOfLeftLeaves(a);
    }

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        sumOfLeftLeaves(root.left);           //返回左子树的高度
        sumOfLeftLeaves(root.right);          //返回右子树的高度
        return sum;
    }
}
