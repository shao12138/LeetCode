package JinDian;

import java.util.Arrays;
import java.util.List;

public class LongestWord_98 {
    TrieNode root;

    public String longestWord(String[] words) {
        this.root = new TrieNode();
        String res = "";
        List<String> wordList = Arrays.asList(words);
        //排序好，第一个返回的即是结果
        wordList.sort((a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
        //构造字典树
        for (String word : wordList) insert(word);
        for (String word : wordList) {
            TrieNode cur = root;
            int n = word.length();
            for (int i = 0; i < n; i++) {
                char c = word.charAt(i);
                //排除掉自己组成自己，当前遍历到的字符是个单词，且剩余部分可以再次被切分
                if (i < n - 1 && cur.children[c - 'a'].isEnd && canSplitToWord(word.substring(i + 1))) {
                    return word;
                }
                cur = cur.children[c - 'a'];
            }
        }
        return res;
    }

    /**
     * 当前的单词可以被切分，在wordList中找到
     *
     * @param remain
     * @return
     */
    private boolean canSplitToWord(String remain) {
        //当没有可以切分的了 返回True
        if (remain.equals("")) return true;
        TrieNode cur = root;
        for (int i = 0; i < remain.length(); i++) {
            char c = remain.charAt(i);//拿到当前的字符
            if (cur.children[c - 'a'] == null) return false;//这个节点找不到
            //当前的节点是个单词，且剩余部分可以再次被切分
            if (cur.children[c - 'a'].isEnd && canSplitToWord(remain.substring(i + 1))) {
                return true;
            }
            cur = cur.children[c - 'a'];
        }
        return false;
    }

    /**
     * Trie树插入一个单词
     *
     * @param word
     */
    private void insert(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TrieNode();
            }
            cur = cur.children[c - 'a'];
        }
        cur.isEnd = true;
    }

    /**
     * 构建字典树的结构
     */
    class TrieNode {
        private TrieNode[] children;
        private boolean isEnd;//当前的字符是否是一个单词的结尾

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isEnd = false;
        }
    }
}
