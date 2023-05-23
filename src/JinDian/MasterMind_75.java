package JinDian;

public class MasterMind_75 {
    public int[] masterMind(String solution, String guess) {
        int a = 0;
        int b = 0;
        char[] s1 = solution.toCharArray();
        char[] s2 = guess.toCharArray();

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == s2[i]) {
                a++;
                s1[i] = '0';
                s2[i] = '1';
            }
        }
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]) {
                    b++;
                    s1[i] = '0';
                    s2[j] = '1';
                }
            }
        }
        return new int[]{a, b};
    }
}
