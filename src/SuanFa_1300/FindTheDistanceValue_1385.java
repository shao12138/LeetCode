package SuanFa_1300;

public class FindTheDistanceValue_1385 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 5, 8};
        int[] arr2 = new int[]{10, 9, 1, 8};
        int d = 2;
        findTheDistanceValue(arr1, arr2, d);
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    break;
                } else {
                    temp++;
                }
            }
            if (temp == arr2.length) {
                count++;
            }
        }
        return count;
    }
}
