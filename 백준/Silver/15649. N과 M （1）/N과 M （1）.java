import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static int n, m;
    static int[] arr = new int[10];
    static boolean[] visited = new boolean[10];

    public static void dfs(int k) {

        if (k == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
            return;

        } else {
            for (int i = 1; i <= n; i++) {
                if(!visited[i]) {
                    arr[k] = i;
                    visited[i] = true;
                    dfs(k+1);
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        dfs(0);

    }


}
