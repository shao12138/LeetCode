package SuanFa_200;

import java.util.ArrayList;
import java.util.List;

public class Codec_297 {
    String a = "";

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        preorderTraversal(root);
        return a;
    }

    public TreeNode deserialize(String data) {
        if (data.equals("")) {
            return null;
        }
        String[] f = data.split(" ");
        return create(f);
    }

    private int i = 0;

    private TreeNode create(String[] prelist) {
        TreeNode p = null;
        if (i < prelist.length) {
            String elem = prelist[i];
            i++;
            if (!elem.equals("^")) {      //不能elem!="∧"，因为T不一定是String
                p = new TreeNode(Integer.parseInt(elem));   //创建叶子结点
                p.left = create(prelist);      //创建p的左子树，递归调用，实际参数与形式参数相同
                p.right = create(prelist);      //创建p的右子树，递归调用，实际参数与形式参数相同
            }
        }
        return p;
    }

    public String preorderTraversal(TreeNode root) {
        if (root != null) {
            a += root.val + " ";
            preorderTraversal(root.left);    //按先根次序遍历p的左子树，递归调用，参数为左孩子
            preorderTraversal(root.right);     //按先根次序遍历p的右子树，递归调用，参数为右孩子
        } else {
            a += "^ ";
        }
        return a;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        a.left = b;
        a.right = c;
        Codec_297 code = new Codec_297();
        String result = code.serialize(a);
        code.deserialize(result);
    }
}
