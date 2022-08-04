package SuanFa_RuMen;

import java.util.LinkedList;
import java.util.Queue;

public class SearchBST_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val == val) {
                return node;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return null;
    }
}
