package SuanFa_200;

public class IsPowerOfTwo_231 {
    public static void main(String[] args) {
        int n = 536870912;
    }
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n-1)) == 0);
    }
//    超时
//    public boolean isPowerOfTwo(int n) {
//        int x= 1;
//        while (x<n){
//            x*=2;
//        }
//        return x==n;
//    }
    //高精度下有误差
//    public static boolean isPowerOfTwo(int n) {
//        if (n==1){
//            return true;
//        }
//        if ((Math.log(n) / Math.log(2))%1==0){
//            return true;
//        }else {
//            return false;
//        }
//    }

}
