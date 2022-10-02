package SuanFa_1800;

public class MinSpeedOnTime_1870 {
    public static void main(String[] args) {
        int[] dist = new int[]{1, 1, 100000};
        double hour = 2.01;
        minSpeedOnTime(dist, hour);
    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        int left = 1;
        int right = 1000000000;
        while (left < right) {
            int middle = (left + right) / 2;
            double sum = 0;
            for (int i = 0; i < dist.length - 1; i++) {
                sum += (int) Math.ceil((double) dist[i] / middle);
            }
            sum += (double) dist[dist.length - 1] / middle;
            if (sum <= hour) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        if (left == 1000000000) {
            return -1;
        }
        return left;
    }
}
