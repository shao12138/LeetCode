package SuanFa_1800;

public class MaximumRemovals_1898 {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0;
        int right = removable.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (!isSubsequence(s, p, middle, removable)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return right + 1;
    }

    //判断字符串是否是子集
    public boolean isSubsequence(String s, String p, int k, int removable[]) {// 判断p是否是s的子串,且不能包含被删除的元素
        int m = s.length();
        int n = p.length();
        int i = 0;
        int j = 0;
        boolean[] state = new boolean[m];
        for (int x = 0; x <= k; x++) {
            state[removable[x]] = true;
        }

        while (i < m && j < n) {
            if (s.charAt(i) == p.charAt(j) && !state[i]) {
                j++;
            }
            i++;
        }
        return j == n;
    }
}
