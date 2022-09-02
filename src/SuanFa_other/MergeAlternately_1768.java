package SuanFa_other;

public class MergeAlternately_1768 {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        int length1 = word1.length();
        int length2 = word2.length();
        int length = Math.min(length2, length1);
        int index = 0;
        while (index < length) {
            result += word1.charAt(index);
            result += word2.charAt(index);
            index++;
        }
        result += length1 > length2 ? word1.substring(index) : word2.substring(index);
        return result;
    }
}
