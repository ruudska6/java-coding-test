import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static Queue<Integer> queue = new LinkedList<>();
    static boolean[] visited;
    static ArrayList<Integer>[] adj;

    static void dfs(int x) {
        visited[x] = true;
        System.out.print(x + " ");

        for (int i : adj[x]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int x) {
        queue.add(x);
        visited[x] = true;

        while (!queue.isEmpty()) {
            Integer q = queue.poll();
            System.out.print(q + " ");

            for (int o : adj[q]) {
                if (!visited[o]) {
                    queue.add(o);
                    visited[o] = true;
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        adj = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(adj[i]);
        }

        dfs(v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(v);
    }
}
