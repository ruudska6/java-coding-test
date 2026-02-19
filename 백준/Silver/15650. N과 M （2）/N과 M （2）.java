import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static boolean[] visited;
    static int[] A;

    static void dfs(int K, int L) {
        if (L == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(A[i] + " ");
            }

            System.out.println();
        } else {

            for (int i = 1; i <= N; i++) {
                if (!visited[i] && K < i) {
                    visited[i] = true;
                    A[L] = i;
                    dfs(i, L+1);
                    visited[i] = false;
                }
            }

        }
    }
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        A = new int[N+1];
        dfs(0, 0);
    }
}
