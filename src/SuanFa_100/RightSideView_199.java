package SuanFa_100;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List result = new LinkedList();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int fin = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode temp = queue.poll();
                fin = temp.val;
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            result.add(fin);
        }
        return result;
    }
}
