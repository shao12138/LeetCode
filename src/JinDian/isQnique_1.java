package JinDian;

public class isQnique_1 {
    public boolean isUnique(String astr) {
        int[] count = new int[astr.length()];
        int num = astr.charAt(0);
        for (int i = 0; i < astr.length(); i++) {
            num = astr.charAt(i);
            count[num]++;
            if (count[num] > 1) {
                return false;
            }
        }
        return true;
    }
}
