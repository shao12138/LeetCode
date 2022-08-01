package SuanFa_RuMen;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal_144 {
    Stack<TreeNode> stack = new Stack();
    List a = new ArrayList();

    public List<Integer> preorderTraversal(TreeNode root) {
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                a.add(root.val);
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                root = root.right;
            }
        }
        return a;
    }
}
