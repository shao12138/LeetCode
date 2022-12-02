package Offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation_38 {
    List<String> res = new ArrayList<String>();

    public String[] permutation(String s) {
        char[] output = s.toCharArray();
        int n = s.length();
        backtrack(n, output, 0);
        int i = 0;
        String[] re = new String[res.size()];
        for (String str : res) {
            re[i++] = str;
        }
        return re;
    }

    public void backtrack(int n, char[] output, int first) {
        // 所有数都填完了
        if (first == n && !res.contains(new String(output))) {
            res.add(new String(output));
        }
        Set<Character> set = new HashSet<>();
        for (int i = first; i < n; i++) {
            if (set.contains(output[i])) {
                continue;
            }
            set.add(output[i]);
            // 动态维护数组
            swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, first + 1);
            // 撤销操作
            swap(output, first, i);
        }
    }

    public void swap(char[] chars, int x, int y) {
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }
}
