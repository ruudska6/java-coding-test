import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] A;
    static StringBuilder sb;

    static void dfs(int k, int level) {
        if (level == M) {
            for (int i = 0; i < M; i++) {
                sb.append(A[i]).append(" ");
            }

            sb.append("\n");
        } else {

            for (int i = 1; i <= N; i++) {
                if (k <= i) {
                    A[level] = i;
                    dfs(i, level + 1);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sb = new StringBuilder();

        N = scanner.nextInt();
        M = scanner.nextInt();
        A = new int[M];

        dfs(1, 0);

        System.out.println(sb);
    }
}
