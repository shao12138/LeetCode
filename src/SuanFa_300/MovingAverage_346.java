package SuanFa_300;

public class MovingAverage_346 {
    int[] temp;
    int num = 0;
    int index = 0;

    public MovingAverage_346(int size) {
        temp = new int[size];
    }

    public double next(int val) {
        if (num < temp.length) {
            num++;
        }
        temp[index % temp.length] = val;
        index++;
        double sum = 0;
        for (int i : temp) {
            sum += i;
        }
        return sum / num;
    }

    public static void main(String[] args) {
        MovingAverage_346 a = new MovingAverage_346(2);
        a.next(-50);
        a.next(25);
        a.next(50);
    }
}
