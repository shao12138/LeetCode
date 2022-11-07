package Offer;

public class ReverseLeftWords_58 {
    public String reverseLeftWords(String s, int n) {
        String left = s.substring(0, n);
        String result = s.substring(n) + left;
        return result;
    }
}
