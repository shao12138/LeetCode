package JinDian;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepth_26 {
    public ListNode[] listOfDepth(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();//队列里面存放结点
        List result = new ArrayList<>();
        queue.offer(root);//根节点先入队
        while (!queue.isEmpty()) {
            int levelNum = queue.size();//获取当前层的节点数.
            //遍历当前层结点
            ListNode temp = new ListNode();
            ListNode p = temp;
            for (int i = 0; i < levelNum; i++) {
                //队首出队并将value加入子list
                TreeNode node = queue.poll();
                if (node != null) {
                    p.next= new ListNode(node.val);
                    p = p.next;
                    if (node.left != null) {//如果队首的左结点不为空就把左结点入队
                        queue.offer(node.left);
                    }
                    if (node.right != null) {//如果队首的右结点不为空就把右结点入队
                        queue.offer(node.right);
                    }
                }
            }
            result.add(temp.next);
        }
        return (ListNode[]) result.toArray(new ListNode[result.size()]);
    }
}
