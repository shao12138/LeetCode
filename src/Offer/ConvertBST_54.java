package Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ConvertBST_54 {
    List a = new ArrayList();
    Stack<TreeNode> stack = new Stack();


    public TreeNode convertBST(TreeNode root) {
        TreeNode result = root;
        while (result != null || !stack.isEmpty()) {
            if (result != null) {
                a.add(result.val);
                stack.push(result);
                result = result.left;
            } else {
                result = stack.pop();
                result = result.right;
            }
        }
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                root = root.right;
            }
        }
        return null;
    }
}
