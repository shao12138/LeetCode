package JinDian;

public class IsQnique_1 {
    public boolean isUnique(String astr) {
        if(astr.equals("")){
            return true;
        }
        int[] count = new int[26];
        int num = astr.charAt(0);
        for (int i = 0; i < astr.length(); i++) {
            num = astr.charAt(i)-'a';
            count[num]++;
            if (count[num] > 1) {
                return false;
            }
        }
        return true;
    }
}
