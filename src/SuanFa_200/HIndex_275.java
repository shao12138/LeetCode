package SuanFa_200;

public class HIndex_275 {
    public static void main(String[] args) {
        int[] citations = new int[]{0, 1};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        if (citations.length == 1) {
            return citations[0] >= 1 ? 1 : 0;
        }
        int left = citations[0];
        int right = citations[citations.length - 1];
        int middle = 0;
        int ans = 0;
        while (left <= right) {
            middle = left + (right - left) / 2;
            int temp = citations.length - middle;
            if (temp >= citations[middle]) {
                left = middle + 1;
            } else {
                right = middle;
                ans = middle;
            }
        }
        return ans;
    }
}
