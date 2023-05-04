import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        Arrays.sort(nums, ((o1, o2) -> o1[0] - o2[0]));
        int start = nums[0][0];
        int end = nums[0][1];
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i][0] >= end) {
                result += (end - nums[i - 1][0]) * 3;
                end = nums[i][1];
            } else {
                result += (end - nums[i][0]) * 4 + (nums[i][0] - nums[i - 1][0]) * 3;
                end = Math.min(end, nums[i][1]);
            }
        }
        System.out.println(result);
    }
}