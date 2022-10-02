package SuanFa_1300;

public class SortByBits_1356 {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int a_num = Integer.bitCount(arr[j]);
                int b_num = Integer.bitCount(arr[j + 1]);
                if (a_num > b_num) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else if (a_num == b_num) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
