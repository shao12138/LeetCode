package Offer;

import java.util.ArrayList;
import java.util.List;

public class KthLargest_54 {
    List<Integer> a = new ArrayList();

    public int kthLargest(TreeNode root, int k) {
        postorderTraversal(root);
        return a.get(a.size() - 1 - k);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            a.add(root.val);
            postorderTraversal(root.right);
        }
        return a;
    }
}
