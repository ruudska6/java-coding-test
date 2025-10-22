import java.util.Scanner;

public class Main {

    static int[] arr;
    static int N,M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        arr = new int[M];

        dfs(0, 1);
    }

    private static void dfs(int k, int start) {
        if (k == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= N; i++) {
                arr[k] = i;
                dfs(k+1, i);
            }
        }
    }
}
