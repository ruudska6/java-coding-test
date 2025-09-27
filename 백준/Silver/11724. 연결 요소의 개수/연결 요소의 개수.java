import java.io.BufferedReader;
import java.io.EOFException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static private ArrayList<Integer>[] adj;
    static private boolean[] visited;

    public static void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    private static void dfs(int curr) {
        visited[curr] = true;
        for (int next : adj[curr]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            addEdge(u, v);
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }
}
