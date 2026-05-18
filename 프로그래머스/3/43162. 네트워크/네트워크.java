import java.util.*;

class Solution {
    
    static boolean[] visited;
    static int m;
    static int[][] arr;

    static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;
            
        while(!q.isEmpty()) {
            int cur = q.poll();
            for (int next = 0; next < m; next++) {
                if (!visited[next] && arr[cur][next] == 1) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }  
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        m = n;
        visited = new boolean[m];
        arr = computers;
        
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                bfs(i);
                answer++;
            }
        }
        
        return answer;
    }
}