package Offer;

public class IsBalanced_55 {
    boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return flag;
    }

    public int height(TreeNode p) {    //返回以p结点为根的子树高度，后根次序遍历
        if (p == null)
            return 0;
        int lh = height(p.left);           //返回左子树的高度
        int rh = height(p.right);          //返回右子树的高度
        if (Math.abs(lh - rh) >= 2) {
            flag = false;
        }
        return (lh >= rh) ? lh + 1 : rh + 1;     //当前子树高度为较高子树的高度加1
    }
}
