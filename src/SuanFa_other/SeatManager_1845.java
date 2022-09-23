package SuanFa_other;

public class SeatManager_1845 {
    int seat[];
    int min = 0;

    public SeatManager_1845(int n) {
        seat = new int[n];
    }

    public int reserve() {
        for (int i = min; i < seat.length; i++) {
            if (seat[i] == 0) {
                seat[i] = 1;
                min = i + 1;
                return min;
            }
        }
        return 0;
    }

    public void unreserve(int seatNumber) {
        if (seatNumber - 1 < min) {
            min = seatNumber - 1;
        }
        seat[seatNumber - 1] = 0;
    }
}
