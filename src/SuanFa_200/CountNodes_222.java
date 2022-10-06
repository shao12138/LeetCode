package SuanFa_200;

public class CountNodes_222 {
    public int countNodes(TreeNode root) {
        return size(root);
    }
    public int size(TreeNode p){      //返回以p结点为根的子树的结点数
        if (p==null)
            return 0;
        return 1+size(p.left)+size(p.right);
    }
}
