import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static boolean arrive;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        adj = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adj[a].add(b);
            adj[b].add(a);
        }

        for (int i = 0; i < n; i++) {
            if (arrive) break;

            dfs(i, 1);
        }

        if (arrive) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }

    private static void dfs(int k, int depth) {
        visited[k] = true;
        if (arrive || depth == 5) {
            arrive = true;
            return;
        } else {
            for (int i : adj[k]) {
                if (!visited[i]) {
                    visited[i] = true;
                    dfs(i, depth + 1);
                }
            }
        }

        visited[k] = false;
    }
}
