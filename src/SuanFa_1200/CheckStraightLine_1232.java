package SuanFa_1200;

public class CheckStraightLine_1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        double min_k = (coordinates[1][0] - coordinates[0][0]);
        if (min_k == 0) {
            for (int i = 2; i < coordinates.length - 1; i++) {
                if (coordinates[i][0] != coordinates[1][0] || coordinates[i][0] != coordinates[i + 1][0]) {
                    return false;
                }
            }
            return true;
        }
        double k = (coordinates[1][1] - coordinates[0][1]) / min_k;
        double b = coordinates[0][1] - k * coordinates[0][0];
        for (int i = 2; i < coordinates.length; i++) {
            if (coordinates[i][1] != k * coordinates[i][0] + b) {
                return false;
            }
        }
        return true;
    }
}
