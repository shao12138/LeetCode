package SuanFa_RuMen;

import java.util.ArrayList;
import java.util.List;

public class IsValidBST_98 {
    List<Integer> a = new ArrayList();

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            a.add(root.val);
            inorderTraversal(root.right);
        }
    }

    public boolean isValidBST(TreeNode root) {
        inorderTraversal(root);
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) >= a.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
