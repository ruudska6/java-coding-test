import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int n;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);

    }

    static void dfs(int number, int k) {
        if (k == n) {
            if (isPrime(number)) {
                System.out.println(number);
            }

            return;
        } else {
            for (int i = 1; i < 10; i++) {
                if (isPrime(number * 10 + i)) {
                    dfs(number * 10 + i, k + 1);
                }
            }
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
