package SuanFa_RuMen;

import java.util.LinkedList;
import java.util.Queue;

public class InsertIntoBST_701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null){
            return new TreeNode(val);
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (val > node.val) {
                if (node.right != null) {
                    queue.offer(node.right);
                } else {
                    node.right = new TreeNode(val);
                }
            } else {
                if (node.left != null) {
                    queue.offer(node.left);
                } else {
                    node.left = new TreeNode(val);
                }
            }
        }
        return root;
    }
}
