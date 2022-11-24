package Offer;

public class VerifyPostorder_33 {
    public boolean verifyPostorder(int[] postorder) {
        //思路，从左往右迭代，依次成为当前结点
        // 从当前节点往左看，碰到比它小的后，就不能碰到比它大的
        boolean sign = false;
        for (int i = 0; i < postorder.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (postorder[j] < postorder[i]) {
                    //出现了比当前小的
                    sign = true;
                }
                //出现了比当前结点大的且之前已经出现了比当前结点小的
                if (sign == true && postorder[j] > postorder[i]) return false;
            }
            sign = false;
        }
        return true;
    }
}
