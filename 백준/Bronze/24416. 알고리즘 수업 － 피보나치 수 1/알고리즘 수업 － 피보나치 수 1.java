import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int cntV0;
    static int cntV1;
    static int[] dp = new int[45];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        cntV0 = 0;
        fibo(n);
        System.out.print(cntV0 + " ");
        cntV1 = 0;
        fibonacci(n);
        System.out.print(cntV1 + " ");
    }

    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            cntV0++;
            return 1;
        }
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static int fibonacci(int n) {
        if (dp[n] != 0) return dp[n];
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            cntV1++;
            return dp[n] = fibonacci(n-2) + fibonacci(n-1);
        }
    }
}
