package Offer;

public class BuildTree_7 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree1(0, 0, preorder.length - 1, preorder, inorder);
    }

    public TreeNode buildTree1(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (inStart > inEnd || preStart > preorder.length)
            return null;
        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);
        int k = 0;
        for (int i = 0; i < preorder.length; i++) {
            if (inorder[i] == rootValue) {
                k = i;
                break;
            }
        }
        root.left = buildTree1(preStart + 1, inStart, k - 1, preorder, inorder);
        root.right = buildTree1(preStart + 1 + k - inStart, k + 1, inEnd, preorder, inorder);
        return root;
    }
}
