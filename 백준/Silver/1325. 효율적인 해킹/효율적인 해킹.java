import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m;

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] count;
    static Queue<Integer> q = new ArrayDeque<>();

    private static void bfs(int k) {
        q.offer(k);
        visited[k] = true;

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int i : adj[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                    count[i]++;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        adj = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        count = new int[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adj[a].add(b);
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n+1];
            bfs(i);
        }

        int max = -1;
        for (int i = 1; i <= n; i++) {
            max = Math.max(count[i], max);
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
