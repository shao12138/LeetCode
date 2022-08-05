package SuanFa_RuMen;

import java.util.*;

public class FindTarget_653 {
    List<Integer> a = new ArrayList();

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            a.add(root.val);
            inorderTraversal(root.right);
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        inorderTraversal(root);
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int temp = a.get(left) + a.get(right);
            if (temp > k) {
                right--;
            } else if (temp < k) {
                left++;
            } else if (temp == k) {
                return true;
            }
        }
        return false;
    }
}
