package SuanFa_200;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor_236 {
    ArrayList<TreeNode> res = new ArrayList<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
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
        res = new ArrayList<>();
        dfs(root, new ArrayList<>(), node);
        return res;
    }

    private void dfs(TreeNode root, List<TreeNode> path, TreeNode node) {
        if (root == null) return;
        path.add(root);
        if (root.val == node.val) {
            res = new ArrayList<>(path);
        }
        dfs(root.left, path, node);
        dfs(root.right, path, node);
        path.remove(path.size() - 1);
    }
}
