package SuanFa_100;

import java.util.*;

public class ZigzagLevelOrder_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<>();//队列里面存放结点
        List result = new ArrayList<>();
        queue.offer(root);//根节点先入队
        while (!queue.isEmpty()) {
            int levelNum = queue.size();//获取当前层的节点数.
            //遍历当前层结点
            ArrayList temp = new ArrayList();
            for (int i = 0; i < levelNum; i++) {
                //队首出队并将value加入子list
                TreeNode node = queue.poll();
                if (node != null) {
                    temp.add(node.val);
                    if (node.left != null) {//如果队首的左结点不为空就把左结点入队
                        queue.offer(node.left);
                    }
                    if (node.right != null) {//如果队首的右结点不为空就把右结点入队
                        queue.offer(node.right);
                    }
                }
            }
            if (flag) {
                flag = false;
            } else {
                Collections.reverse(temp);
                flag = true;
            }
            result.add(temp);
        }
        return result;
    }
}
