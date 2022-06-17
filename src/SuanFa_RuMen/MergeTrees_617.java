package SuanFa_RuMen;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MergeTrees_617 {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        Queue<TreeNode> queue = new LinkedList();
        Queue<TreeNode> queue1 = new LinkedList();
        Queue<TreeNode> queue2 = new LinkedList();
        TreeNode merged = new TreeNode(root1.val + root2.val);
        queue.offer(merged);
        queue1.offer(root1);
        queue2.offer(root2);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode temp = queue.poll();
            TreeNode temp1 = queue1.poll();
            TreeNode temp2 = queue2.poll();
            TreeNode left1 = temp1.left;
            TreeNode left2 = temp2.left;
            TreeNode right1 = temp1.right;
            TreeNode right2 = temp2.right;
            if (left1 != null || left2 != null) {
                if (left1 != null && left2 != null) {
                    TreeNode left = new TreeNode(left1.val + left2.val);
                    temp.left = left;
                    queue.offer(left);
                    queue1.offer(left1);
                    queue2.offer(left2);
                } else if (left1 != null) {
                    temp.left = left1;
                } else if (left2 != null) {
                    temp.left = left2;
                }
            }
            if (right1 != null || right2 != null) {
                if (right1 != null && right2 != null) {
                    TreeNode right = new TreeNode(right1.val + right2.val);
                    temp.right = right;
                    queue.offer(right);
                    queue1.offer(right1);
                    queue2.offer(right2);
                } else if (right1 != null) {
                    temp.right = right1;
                } else {
                    temp.right = right2;
                }
            }
        }
        return merged;
    }
}

//class Solution {
//    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        if (root1==null&&root2==null){
//            return null;
//        }
//        if (root1==null||root2==null){
//            return root1==null?root2:root1;
//        }
//        root2.val = root2.val + root1.val;
//        root2.left = mergeTrees(root1.left,root2.left);
//        root2.right = mergeTrees(root1.right,root2.right);
//        return root2;
//    }
//}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}