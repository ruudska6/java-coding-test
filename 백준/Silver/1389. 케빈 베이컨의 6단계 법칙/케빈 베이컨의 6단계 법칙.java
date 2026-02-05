import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;


    private static int bfs(int k) {
        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[n+1];
        visited = new boolean[n+1];

        q.offer(k);
        visited[k] = true;

        while (!q.isEmpty()) {
            int now = q.poll();
            for (int i : adj[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                    dist[i] += dist[now] + 1;
                }
            }
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += dist[i];
        }

        return sum;
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

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        int min = Integer.MAX_VALUE;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = bfs(i);
            if (sum < min) {
                min = sum;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
