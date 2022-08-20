package SuanFa_100;

public class SortedArrayToBST_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return nums == null ? null : buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int middle = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = buildTree(nums, l, middle - 1);
        root.right = buildTree(nums, middle + 1, r);
        return root;
    }
}
