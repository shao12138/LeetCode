package SuanFa_200;

import java.util.ArrayList;

public class GetHint_299 {
    public static void main(String[] args) {
        String secret = "1122";
        String guess = "2211";
        getHint(secret, guess);
    }

    public static String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList<String> t = new ArrayList();
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;
                arrayList.add(i);
            } else {
                t.add(secret.charAt(i)+"");
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (!arrayList.contains(i)) {
                char c = guess.charAt(i);
                if (t.contains(c+"")) {
                    t.remove(c+"");
                    b++;
                }
            }
        }
        return a + "A" + b + "B";
    }
}
