package Offer;

import java.util.LinkedList;
import java.util.Stack;

public class InorderSuccessor_53 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        LinkedList<TreeNode> a = new LinkedList();
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                a.add(root);
                root = root.right;
            }
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == p && i < a.size() - 1) {
                return a.get(i + 1);
            }
        }
        return null;
    }
}
