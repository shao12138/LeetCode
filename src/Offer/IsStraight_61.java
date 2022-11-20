package Offer;

public class IsStraight_61 {
    public boolean isStraight(int[] nums) {
        //判断是否存在重复数字
        int[] arr = new int[14];
        int min = 14,max = -1;
        for(int nu: nums) {
            if(nu == 0) {continue;}
            if(arr[nu] == 1) return false;
            arr[nu] ++;
            min = Math.min(min,nu);
            max = Math.max(max,nu);
        }
        return max-min <= 4;
    }
}
