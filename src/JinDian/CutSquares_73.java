package JinDian;

public class CutSquares_73 {
    public static void main(String[] args) {
        int[] square1 = new int[]{249, -199, 5};
        int[] square2 = new int[]{-1, 136, 76};
        cutSquares(square1, square2);
    }

    public static double[] cutSquares(int[] square1, int[] square2) {
        double x1 = square1[0] + square1[2] / 2.0;
        double y1 = square1[1] + square1[2] / 2.0;

        double x2 = square2[0] + square2[2] / 2.0;
        double y2 = square2[1] + square2[2] / 2.0;

        if (x1 == x2) {
            double temp1 = square1[1] + square1[2];
            double temp2 = square2[1] + square2[2];
            return new double[]{x1, Math.min(square1[1], square2[1]), x1, Math.max(temp2, temp1)};
        }
        double[] result = new double[4];
        double k = (y2 - y1) / (x2 - x1);
        double b = y2 - k * x2;

        if(Math.abs(k) >= 1){ // 直线穿过两个正方形的上下边
            result[1] = Math.min(square1[1], square2[1]);  // 先求出y，选两个正方形中靠下的底边
            result[0] = (result[1]-b)/k;
            result[3] = Math.max(square1[1]+square1[2], square2[1]+square2[2]);
            result[2] = (result[3]-b)/k;
        }else{
            result[0] = Math.min(square1[0], square2[0]);
            result[1] = k*result[0]+b;
            result[2] = Math.max(square1[0]+square1[2], square2[0]+square2[2]);
            result[3] = k*result[2]+b;
        }
        if(result[0] > result[2]){
            swap(result, 0, 2);
            swap(result, 1, 3);
        }
        return result;
    }
    public static void swap(double[] res, int x, int y){
        double temp = res[x];
        res[x] = res[y];
        res[y] = temp;
    }
}
