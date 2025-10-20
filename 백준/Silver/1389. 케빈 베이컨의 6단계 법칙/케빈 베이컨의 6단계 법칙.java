import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static List<Integer>[] adj;
    static boolean[] visited;
    static int N,M;
    static int[] dist;
    static int[] kevin;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N+1];
        visited = new boolean[N+1];
        kevin = new int[N+1];

        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }

        int min = 1;
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            bfs(i);
            if (kevin[i] < kevin[min]) {
                min = i;
            }
        }

        System.out.println(min);
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        dist = new int[N + 1];

        while (!q.isEmpty()) {
            Integer cur = q.poll();

            for (int next : adj[cur]) {
                if (!visited[next]) {
                    q.offer(next);
                    visited[next] = true;
                    dist[next] = dist[cur] + 1;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            kevin[start] += dist[i];
        }
    }
}
