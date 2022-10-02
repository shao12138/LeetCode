package SuanFa_1400;

public class Average_1491 {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double result = 0.0;
        for (int i = 0; i < salary.length; i++) {
            min = Math.min(salary[i], min);
            max = Math.max(salary[i], max);
            result += salary[i];
        }
        result -= min;
        result -= max;
        return result / (salary.length - 2);
    }
}
