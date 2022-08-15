package SuanFa_100;

import java.util.ArrayList;
import java.util.List;

public class WordBreak_139 {
    public static void main(String[] args) {
        String a = "catsandog";
        List s = new ArrayList();
        s.add("cats");s.add("dog");s.add("sand");s.add("and");s.add("cat");
        wordBreak(a,s);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        // 初始化
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // 右半部分存在于单词字典中
                String word = s.substring(j, i);
                // 左半部分由dp递推得到
                if (wordDict.contains(word) && dp[j]) {
                    dp[i] = true;
                }
            }
        }
        return dp[n];
    }
}
