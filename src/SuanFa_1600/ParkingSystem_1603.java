package SuanFa_1600;

public class ParkingSystem_1603 {
    int a;
    int b;
    int c;

    public ParkingSystem_1603(int big, int medium, int small) {
        a = big;
        b = medium;
        c = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            a--;
        } else if (carType == 2) {
            b--;
        } else if (carType == 3) {
            c--;
        }
        if (a < 0) {
            a++;
            return false;
        }
        if (b < 0) {
            b++;
            return false;
        }
        if (c < 0) {
            c++;
            return false;
        }
        return true;
    }
}
