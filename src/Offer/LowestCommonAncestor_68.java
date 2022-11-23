package Offer;

import java.util.ArrayList;

public class LowestCommonAncestor_68 {
    public TreeNode LowestCommonAncestor_68(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> a = findNode(root, p);
        ArrayList<TreeNode> b = findNode(root, q);
        int f = Math.min(a.size(), b.size());
        for (int i = 0; i < f; i++) {
            if (a.get(i).val != b.get(i).val) {
                return a.get(i - 1);
            }
        }
        return a.get(f - 1);
    }

    public ArrayList<TreeNode> findNode(TreeNode root, TreeNode node) {
        ArrayList result = new ArrayList();
        while (root != null) {
            result.add(root);
            if (root.val == node.val) {
                return result;
            } else if (root.val > node.val) {
                root = root.left;
            } else if (root.val < node.val) {
                root = root.right;
            }
        }
        return null;
    }
}
