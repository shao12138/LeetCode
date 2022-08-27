package SuanFa_800;

public class PeekIndexInMountainArray_852 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0};
        peakIndexInMountainArray(nums);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] < arr[left + 1]) {
                left++;
            }
            if (arr[right] < arr[right - 1]) {
                right--;
            }
        }
        return left;
    }
}
