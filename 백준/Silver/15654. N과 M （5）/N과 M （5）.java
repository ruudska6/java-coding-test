import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] arr;
    static int[] ch;
    static boolean[] visited;
    static int N, M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        arr = new int[N];
        visited = new boolean[N];
        ch = new int[M];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        dfs(0);
    }

    private static void dfs(int k) {
        if (k == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(ch[i] + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i = 0; i < N; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    ch[k] = arr[i];
                    dfs(k + 1);
                    visited[i] = false;
                }
            }
        }

    }
}
