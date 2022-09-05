package SuanFa_1100;

public class DistanceBetweenBusStops_1184 {
    public static void main(String[] args) {
        int[] distance = new int[]{7, 10, 1, 12, 11, 14, 5, 0};
        int start = 7;
        int destination = 2;
        System.out.println(distanceBetweenBusStops(distance, start, destination));
    }

    public static int distanceBetweenBusStops(int[] distance, int start1, int destination1) {
        int sum1 = 0;
        int sum2 = 0;
        int start = Math.min(start1, destination1);
        int destination = Math.max(start1, destination1);
        for (int i = start; i < destination; i++) {
            sum1 += distance[i];
        }
        for (int i = start-1; i >= 0; i--) {
            sum2 += distance[i];
        }
        for (int i = distance.length - 1; i >= destination; i--) {
            sum2 += distance[i];
        }
        return Math.min(sum1, sum2);
    }
}
