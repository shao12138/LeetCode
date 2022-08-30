package SuanFa_500;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Preorder_589 {
    List a = new ArrayList();
    public List<Integer> preorder(Node root) {
        if (root != null) {
            a.add(root.val);
            for (int i=0;i<root.children.size();i++){
                preorder(root.children.get(i));
            }
        }
        return a;
    }
}
