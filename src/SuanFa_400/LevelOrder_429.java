package SuanFa_400;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder_429 {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<Node> queue = new LinkedList<>();//队列里面存放结点
        List result = new ArrayList<>();
        queue.offer(root);//根节点先入队
        while (!queue.isEmpty()) {
            int levelNum = queue.size();//获取当前层的节点数.
            //遍历当前层结点
            ArrayList temp = new ArrayList();
            for (int i = 0; i < levelNum; i++) {
                //队首出队并将value加入子list
                Node node = queue.poll();
                if (node != null) {
                    temp.add(node.val);
                    ArrayList<Node> child = (ArrayList) node.children;
                    for (int j = 0; j < child.size(); j++) {
                        queue.offer(child.get(i));
                    }
                }
            }
            result.add(temp);
        }
        return result;

    }
}
