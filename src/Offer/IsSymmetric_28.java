package Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsSymmetric_28 {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List result = new ArrayList<>();
        queue.offer(root);//根节点先入队
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            if (levelNum >= 2 && levelNum % 2 != 0) {
                return false;
            }
            ArrayList temp = new ArrayList();
            for (int i = 0; i < levelNum; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    if (node.left != null) {
                        queue.offer(node.left);
                        temp.add(node.left.val);
                    } else {
                        temp.add(101);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                        temp.add(node.right.val);
                    } else {
                        temp.add(101);
                    }
                }
            }
            int left = 0;
            int right = temp.size() - 1;
            while (left < right) {
                if (temp.get(left) != temp.get(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
