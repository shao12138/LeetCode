package SuanFa_1200;

import java.util.HashSet;
import java.util.Set;

public class NthUglyNumber_1201 {
    public int nthUglyNumber(int n, int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        int i = 1;
        int j = 1;
        int k = 1;
        int last = 0;
        while (set.size() < n) {
            if (a * i <= b * j && a * i <= c * k) {
                set.add(a * i);
                last = a * i;
                i++;
            } else if (b * j <= a * i && b * j <= c * k) {
                set.add(b * j);
                last = b * j;
                j++;
            } else if (c * k <= a * i && c * k <= b * j) {
                set.add(c * k);
                last = c * k;
                k++;
            }
        }
        return last;
    }
}
