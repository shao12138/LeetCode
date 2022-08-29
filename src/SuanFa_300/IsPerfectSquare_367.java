package SuanFa_300;

public class IsPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        if (num==1){
            return true;
        }
        if (num==2){
            return false;
        }
        int left = 1;
        int right = num;
        while (left < right) {
            int middle = left+(right-left)/2;
            int temp = num/middle;
            if (temp > middle) {
                left=middle+1;
            }else if (temp<middle){
                right=middle-1;
            }else if (temp==middle){
                if (num%middle == 0) return true;
            }
        }
        return false;
    }
}
