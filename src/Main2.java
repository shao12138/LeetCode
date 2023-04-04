import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i=0;i<t;i++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] nums = new int[n];
            for (int j=0;j<n;j++){
                nums[j] = scanner.nextInt();
            }
            System.out.println(Math.ceil(n/(k-1)));
        }
    }
}








