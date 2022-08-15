package SuanFa_100;

public class TwoSum_167 {
    public static void main(String[] args) {
        int number[] = {0,0,3,4 };
        twoSum(number,0);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int middle = target / 2;
        int left = 0;
        int right = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]==middle&&numbers[i+1]==middle){
                return new int[]{i+1 , i + 2};
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<=target / 2.0&&numbers[i+1]>=target / 2.0){
                left = i;
                right = i+1;
                break;
            }
        }
        int sum = numbers[left]+numbers[right];
        while (sum!=target){
            if (sum<target){
                right++;
            }else {
                left--;
            }
            sum = numbers[left]+numbers[right];
        }
        int[] newNum  = {left+1,right+1};
        for (int i =0;i<newNum.length;i++){
            System.out.print(newNum[i]+1+" ");
        }
        return newNum;
    }
}
