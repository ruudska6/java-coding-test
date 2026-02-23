import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static List<Integer>[] adj;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {

            int N = Integer.parseInt(br.readLine());
            adj = new ArrayList[N+1];
            visited = new boolean[N+1];

            for (int i = 1; i <= N; i++) {
                adj[i] = new ArrayList<>();
            }

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 1; i <= N; i++) {
                int k = Integer.parseInt(st.nextToken());
                adj[i].add(k);
            }

            int count = 0;
            for (int i = 1; i <=N; i++) {
                if (!visited[i]) {
                    dfs(i);
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static void dfs(int k) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(k);
        visited[k] = true;

        while(!stack.isEmpty()) {
            Integer now = stack.pop();
            for (int x : adj[now]) {
                if (!visited[x]) {
                    visited[x] = true;
                    stack.push(x);
                }
            }
        }
    }
}
