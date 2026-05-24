import java.util.*;

class Solution {
    
    static ArrayList<Integer>[] adj;
    static boolean[] visited;    
    
    static int bfs(int x, int a, int b) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        visited[x] = true;
        int cnt = 1;
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            
            for (int k : adj[cur]) {
                
                if (cur == a && k == b || cur == b && k == a) {
                    continue;
                }
                
                if (!visited[k]) {
                    q.add(k);
                    visited[k] = true;
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
    
    
    public int solution(int n, int[][] wires) {        
        adj = new ArrayList[n+1];
        
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < wires.length; i++) {
            adj[wires[i][0]].add(wires[i][1]);
            adj[wires[i][1]].add(wires[i][0]);
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < wires.length; i++) {
            visited = new boolean[n + 1];
        
            int a = wires[i][0];
            int b = wires[i][1];
        
            int left = bfs(1, a, b);
            int right = n - left;
            
            min = Math.min(Math.abs(left - right), min);
        }
            
        return min;
    }
}