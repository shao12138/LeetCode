package Offer;

public class MovingAverage_41 {
    int[] temp;
    int num = 0;
    int index = 0;

    public MovingAverage_41(int size) {
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
        MovingAverage_41 a = new MovingAverage_41(2);
        a.next(-50);
        a.next(25);
        a.next(50);
    }
}
