package SuanFa_900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm_989 {
    public static void main(String[] args) {
        int[] num = new int[]{2, 1, 5};
        int k = 181;
        addToArrayForm(num, k);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int kk = k;
        ArrayList arrayList = new ArrayList();
        int i = num.length - 1;
        boolean flag = false;
        while (k != 0 && i != -1) {
            int temp = k % 10;
            k /= 10;
            int a = temp + num[i];
            if (flag) {
                a++;
            }
            if (a >= 10) {
                a -= 10;
                flag = true;
            } else {
                flag = false;
            }
            arrayList.add(a);
            i--;
        }
        if (num.length > (kk + "").length()) {
            for (; i >= 0; i--) {
                int a = num[i];
                if (flag) {
                    a++;
                }
                if (a >= 10) {
                    a -= 10;
                    flag = true;
                } else {
                    flag = false;
                }
                arrayList.add(a);
            }
        } else if (num.length < (kk + "").length()) {
            while (k != 0) {
                int a = k % 10;
                k /= 10;
                if (flag) {
                    a++;
                }
                if (a >= 10) {
                    a -= 10;
                    flag = true;
                } else {
                    flag = false;
                }
                arrayList.add(a);
            }
        }
        if (flag) {
            arrayList.add(1);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
