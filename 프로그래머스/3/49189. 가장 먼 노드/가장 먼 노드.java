import java.util.*;

class Solution {
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] count;
    
    static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        visited[x] = true;
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : adj[cur]) {
                if (!visited[next]) {
                    q.offer(next);
                    visited[next] = true;
                    count[next] = count[cur] + 1;
                }
            }
        }
    }
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        adj = new ArrayList[n+1];
        visited = new boolean[n+1];
        count = new int[n+1];
        
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
    
        for (int i = 0; i < edge.length; i++) {
            adj[edge[i][0]].add(edge[i][1]);
            adj[edge[i][1]].add(edge[i][0]);
        }
        
        bfs(1);
        
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            max = Math.max(count[i], max);
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) answer++;
        }
        
        return answer;
    }
}