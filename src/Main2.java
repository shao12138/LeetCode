import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n * 2];
        for (int i = 0; i < n * 2; i++) {
            s[i] = scanner.next();
        }
        for (int i = 0; i < n * 2 - 1; ) {
            String a = s[i];
            String b = s[i + 1];
            a = a.replaceAll("m", "");
            a = a.replaceAll("h", "");
            a = a.replaceAll("y", "");
            b = b.replaceAll("m", "");
            b = b.replaceAll("h", "");
            b = b.replaceAll("y", "");
            i += 2;
            if (a.equals(b)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}








