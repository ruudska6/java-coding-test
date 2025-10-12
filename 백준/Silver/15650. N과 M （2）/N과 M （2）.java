import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static int n, m;
    static int[] arr = new int[10];

    public static void dfs(int k, int start) {

        if (k == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
            return;

        } else {
            for (int i = start; i <= n; i++) {
                arr[k] = i;
                dfs(k+1, i+1);

            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        dfs(0,1);

    }


}
