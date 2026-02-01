import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] visited;
    static ArrayList<Integer>[] adj;
    static int n, m, k, x;
    static List<Integer> list;

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = 0;

        while (!q.isEmpty()) {
            Integer now = q.poll();
            for (int num : adj[now]) {
                if (visited[num] == -1) {
                    visited[num] = visited[now] + 1;
                    q.offer(num);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        adj = new ArrayList[n+1];
        for (int i = 1; i < n+1; i++) {
            adj[i] = new ArrayList<>();
        }

        visited = new int[n+1];
        Arrays.fill(visited, -1);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int xx = Integer.parseInt(st.nextToken());
            int yy = Integer.parseInt(st.nextToken());
            adj[xx].add(yy);
        }

        bfs(x);

        for (int i = 1; i < n+1; i++) {
            if (visited[i] == k) list.add(i);
        }

        Collections.sort(list);

        if (!list.isEmpty()) {
            for (int x : list) {
                System.out.println(x);
            }
        } else {
            System.out.println("-1");
        }
    }
}
