package SuanFa_1;

import java.util.*;

public class InorderTraversal_94 {
    static List a = new ArrayList();
    static Stack<TreeNode> stack = new Stack();

    public static List<Integer> inorderTraversal(TreeNode root) {
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
        return a;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.right = b;
        b.left = c;
        inorderTraversal(a);
    }
}
