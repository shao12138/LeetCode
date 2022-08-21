package SuanFa_200;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest_230 {
    List<Integer> a = new ArrayList();

    public int kthSmallest(TreeNode root, int k) {
        postorderTraversal(root);
        return a.get(k - 1);
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
