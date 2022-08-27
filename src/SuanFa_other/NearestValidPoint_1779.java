package SuanFa_other;

public class NearestValidPoint_1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                int temp = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (temp < length) {
                    index = i;
                    length = temp;
                }
            }
        }
        return index;
    }
}
