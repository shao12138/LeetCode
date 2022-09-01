package SuanFa_other;

public class FindKthPositive_1539 {
    public static void main(String[] args) {
        int[] num = new int[]{2,3,4,7,11};
        int k = 5;
        findKthPositive(num, k);

    }

    public static int findKthPositive(int[] arr, int k) {
        int right = 1;
        int left = 0;
        while (k != 0) {
            if (left < arr.length && arr[left] == right) {
                left++;
            } else {
                k--;
            }
            right++;
        }
        return right-1;
    }
}
