package JinDian;

public class BiNode_95 {
    TreeNode pre, head;

    public TreeNode convertBiNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        return head;
    }

    private void dfs(TreeNode cur) {
        // 递归结束条件
        if (cur == null) return;
        dfs(cur.left);
        // 如果pre为空，就说明是第一个节点，头结点，然后用head保存头结点，用于之后的返回
        if (pre == null) head = cur;
            // 如果不为空，那就说明是中间的节点。并且pre保存的是上一个节点，
            // 让上一个节点的右指针指向当前节点
        else if (pre != null) pre.right = cur;
        // 再让当前节点的左指针指向父节点，也就连成了双向链表
        cur.left = null;
        // 保存当前节点，用于下层递归创建
        pre = cur;
        dfs(cur.right);
    }
}
