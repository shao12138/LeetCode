package Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder_32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arrayList = new ArrayList();
        List<Integer> temp = new ArrayList<>();
        if (root == null) {
            return arrayList;
        }
        temp.add(root.val);
        arrayList.add(temp);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int num = queue.size();
            temp = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    temp.add(node.left.val);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    temp.add(node.right.val);
                }
            }
            if (!temp.isEmpty()) {
                if (flag) {
                    arrayList.add(temp);
                    flag = false;
                } else {
                    ArrayList temp2 = new ArrayList();
                    for (int j = temp.size() - 1; j >= 0; j--) {
                        temp2.add(temp.get(j));
                    }
                    arrayList.add(temp2);
                    flag = true;
                }
            }
        }
        return arrayList;
    }
}
