package SuanFa_700;

import java.util.Arrays;

public class LongestWord_720 {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String ans = "";
        Trie trie = new Trie();
        for (String s : words) {
            trie.insert(s);
            if (trie.inDictionary(s) && s.length() > ans.length()) {
                ans = s;
            }
        }
        return ans;
    }
}
class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    void insert(String s) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TrieNode();
            }
            cur = cur.children[c - 'a'];
        }
        cur.exist = true;
    }

    boolean inDictionary(String s) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            cur = cur.children[c - 'a'];
            if (cur == null || !cur.exist) {
                return false;
            }
        }
        return true;
    }
}
class TrieNode {
    boolean exist;
    TrieNode[] children;

    TrieNode() {
        exist = false;
        children = new TrieNode[26];
    }
}