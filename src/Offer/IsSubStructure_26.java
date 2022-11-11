package Offer;

public class IsSubStructure_26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        return dfs(A, B);
    }

    public boolean dfs(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        return check(s, t) || dfs(s.left, t) || dfs(s.right, t);
    }

    public boolean check(TreeNode s, TreeNode t) {
        if (t == null) {
            return true;
        }
        if (s == null || s.val != t.val) {
            return false;
        }
        return check(s.left, t.left) && check(s.right, t.right);
    }
}
