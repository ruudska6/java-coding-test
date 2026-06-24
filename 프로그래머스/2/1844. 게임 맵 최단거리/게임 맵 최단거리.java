import java.util.*;

class Solution {
    static int[] dx = new int[] {-1, 1, 0, 0}; 
    static int[] dy = new int[] {0, 0, -1, 1};
    static boolean[][] visited;
    
    private static int bfs(int x, int y, int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        visited[x][y] = true;
        
        int cnt = 1;
        
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int[] cur = q.poll();
                int curX = cur[0];
                int curY = cur[1];
                for (int j = 0; j < 4; j++) {
                    int nx = curX + dx[j];
                    int ny = curY + dy[j];
                    
                    int n = maps.length - 1;
                    int m = maps[0].length - 1;
                                        
                    if (nx >= 0 && nx <= n && ny >= 0 && ny <= m 
                        && !visited[nx][ny] && maps[nx][ny] == 1) {
                        
                        if (nx == n && ny == m) return cnt + 1;
                        
                        q.offer(new int[] {nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
            
           cnt++;
        }
        
        return -1;
    }
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        visited = new boolean[maps.length][maps[0].length];
        
        answer = bfs(0, 0, maps);
        
        return answer;
    }
}