package SuanFa_RuMen;

public class Pow_50 {
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }
    public static double myPow(double x, int n) {
        double res = 1.0;
        for(int i = n; i != 0; i /= 2){
            if(i % 2 != 0){
                res *= x;
            }
            x *= x;
        }
        return  n < 0 ? 1 / res : res;
    }
}
