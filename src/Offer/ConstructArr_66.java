package Offer;

public class ConstructArr_66 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        constructArr(a);
    }

    public static int[] constructArr(int[] a) {
        if (a.length == 0) {
            return new int[]{};
        }
        int[] left = new int[a.length + 2];
        int[] right = new int[a.length + 2];
        left[0] = 1;
        left[1] = a[0];
        left[left.length - 1] = 1;
        right[0] = 1;
        right[right.length - 2] = a[a.length - 1];
        right[right.length - 1] = 1;
        for (int i = 2; i <= a.length; i++) {
            left[i] = left[i - 1] * a[i - 1];
            right[right.length - i - 1] = right[right.length - i] * a[right.length - i - 2];
        }
        int[] result = new int[a.length];
        for (int i = 1; i <= a.length; i++) {
            result[i - 1] = left[i - 1] * right[i + 1];
        }
        return result;
    }
}
