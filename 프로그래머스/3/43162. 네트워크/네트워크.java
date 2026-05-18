import java.util.*;

class Solution {
    
    static boolean[] visited;

    static void bfs(int x, int n, int[][] computers) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;
            
        while(!q.isEmpty()) {
            int cur = q.poll();
            for (int next = 0; next < n; next++) {
                if (!visited[next] && computers[cur][next] == 1) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }  
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
               
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                bfs(i, n, computers);
                answer++;
            }
        }
        
        return answer;
    }
}