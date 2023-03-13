package JinDian;

public class CompressString_6 {
    public static void main(String[] args) {
        String s = "aabcccccaa";
        compressString(s);
    }

    public static String compressString(String s) {
        if(s.equals("")){
            return "";
        }
        char[] c = s.toCharArray();
        String result = "";
        char temp = c[0];
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == temp) {
                count++;
            } else {
                result += temp + "" + count;
                temp = c[i];
                count = 1;
            }
        }
        result += temp + "" + count;
        if (result.length()>=s.length()){
            return s;
        }
        return result;
    }
}
