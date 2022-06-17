package SuanFa_RuMen;

public class Rotate_189 {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7};
        rotate(num,3);
    }
    public static void rotate(int[] nums, int k) {
        int newNums[] = nums.clone();
        for (int i = 0; i < newNums.length; i++) {
            nums[k % nums.length] = newNums[i];
            k++;
        }
        System.out.print("[");
        for (int i = 0; i < nums.length-1; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.print(nums[nums.length-1]+"]");
    }
}
