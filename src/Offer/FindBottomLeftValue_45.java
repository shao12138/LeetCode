package Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindBottomLeftValue_45 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();//队列里面存放结点
        List<List<Integer>> result = new ArrayList<>();
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
            result.add(temp);
        }
        return result.get(result.size()-1).get(0);
    }
}
