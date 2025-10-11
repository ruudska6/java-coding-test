import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i > 0 && i < 100) {
                count++;
            } else {
                if (isSequence(i)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static boolean isSequence(int n) {
        char[] nchars = String.valueOf(n).toCharArray();

        int prev = nchars[1] - nchars[0];
        for (int i = nchars.length - 1; i > 1; i--) {
            int curr = nchars[i] - nchars[i-1];
            if (curr != prev) return false;
        }
        return true;
    }
}
