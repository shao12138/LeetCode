package SuanFa_200;

public class BadVersion_278 {
    static int target = 1702766719;

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        if (left==right){
            return 1;
        }
        while (left<right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle) == true) {
                right = middle;
            } else if (isBadVersion(middle) == false) {
                left = middle+1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int x) {
        return x == target;
    }
}
