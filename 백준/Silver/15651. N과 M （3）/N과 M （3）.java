import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static int n, m;
    static int[] arr = new int[10];
    static StringBuilder sb = new StringBuilder();
    public static void dfs(int k) {

        if (k == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;

        } else {
            for (int i = 1; i <= n; i++) {
                arr[k] = i;
                dfs(k+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        dfs(0);

        System.out.println(sb.toString());

    }


}

