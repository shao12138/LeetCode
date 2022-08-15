package SuanFa_100;

import SuanFa_800.TreeNode;

import java.util.*;

public class PostorderTraversal_145 {
    List a = new ArrayList();
    Stack<TreeNode> stack = new Stack<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        TreeNode cur, pre = null;       //pre为额外结点，记录前一个结点，用于打印
        stack.push(root);
        while (!stack.isEmpty()) {
            cur = stack.peek();
            if ((cur.left == null && cur.right == null) || (pre != null && (cur.left == pre || cur.right == pre))) {            //判断是否为上述条件决定是否打印
                TreeNode temp = stack.pop();
                a.add(temp.val);
                pre = temp;
            } else {
                if (cur.right != null) {        //右结点入栈
                    stack.push(cur.right);
                }
                if (cur.left != null) {
                    stack.push(cur.left);
                }
            }
        }
        return a;
    }
}
