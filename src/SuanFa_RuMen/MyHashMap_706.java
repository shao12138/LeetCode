package SuanFa_RuMen;

import java.util.Arrays;

public class MyHashMap_706 {
    int[] a;

    public MyHashMap_706() {
        a = new int[1000001];
        Arrays.fill(a, -1);
    }

    public void put(int key, int value) {
        a[key] = value;
    }

    public int get(int key) {
        return a[key];
    }

    public void remove(int key) {
        a[key] = -1;
    }
}
