package JinDian;

import java.util.ArrayList;
import java.util.List;

public class InorderSuccessor_29 {
    List<TreeNode> a = new ArrayList();

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            a.add(root);
            inorderTraversal(root.right);
        }
    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inorderTraversal(root);
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) == p) {
                return a.get(i + 1);
            }
        }
        return null;
    }
}
