package SuanFa_1;

public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        return ss[ss.length - 1].length();
    }
}
