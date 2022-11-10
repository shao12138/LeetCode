package Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_32 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(root.val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
                arrayList.add(node.left.val);
            }
            if (node.right != null) {
                queue.offer(node.right);
                arrayList.add(node.right.val);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}
