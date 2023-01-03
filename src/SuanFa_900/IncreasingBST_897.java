package SuanFa_900;


import java.util.*;

public class IncreasingBST_897 {

    public static TreeNode increasingBST(TreeNode root) {
        Queue<Integer> a = new LinkedList();
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                a.add(root.val);
                root = root.right;
            }
        }
        TreeNode result = new TreeNode(a.poll());
        TreeNode p = result;
        while (!a.isEmpty()) {
            p.right = new TreeNode(a.poll());
            p = p.right;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(7);
        a.left = b;
        a.right = c;
        increasingBST(a);
    }
}
