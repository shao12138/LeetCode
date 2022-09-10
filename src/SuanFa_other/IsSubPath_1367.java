package SuanFa_other;

public class IsSubPath_1367 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        TreeNode t4 = new TreeNode(2);
        t2.right = t4;
        TreeNode t5 = new TreeNode(1);
        t4.left = t5;
        TreeNode t6 = new TreeNode(2);
        t3.left = t6;
        TreeNode t7 = new TreeNode(6);
        t6.left = t7;
        TreeNode t8 = new TreeNode(8);
        t6.right = t8;
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(8);
        l1.next = l2;
        l2.next = l3;
        isSubPath(l1, t1);
    }

    public static boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(root, head);
    }

    public static boolean dfs(TreeNode s, ListNode t) {
        if (s == null) {
            return false;
        }
        return check(s, t) || dfs(s.left, t) || dfs(s.right, t);
    }

    public static boolean check(TreeNode s, ListNode t) {
        if (t == null) {
            return true;
        }
        if (s == null || t == null || s.val != t.val) {
            return false;
        }
        return check(s.left, t.next) || check(s.right, t.next);
    }
}
