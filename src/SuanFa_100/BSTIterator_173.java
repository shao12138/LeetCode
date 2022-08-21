package SuanFa_100;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator_173 {
    List<Integer> a = new ArrayList();
    int index = 0;

    public BSTIterator_173(TreeNode root) {
        postorderTraversal(root);
    }

    public int next() {
        int result = a.get(index);
        index++;
        return result;
    }

    public boolean hasNext() {
        if (index >= a.size()) {
            return false;
        } else {
            return true;
        }
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

