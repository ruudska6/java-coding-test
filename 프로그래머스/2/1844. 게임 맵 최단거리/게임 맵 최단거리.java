import java.util.*;

class Solution {
    
    private static boolean[][] visited;
    private static int[] dx = new int[] {-1, 1, 0, 0};    
    private static int[] dy = new int[] {0, 0, -1, 1};   
    
    private static int bfs(int i, int j, int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        visited[i][j] = true;
        q.offer(new int[] {i, j});
        int dis = 0;
        
        while (!q.isEmpty()) {
            int cur[] = q.poll();
            for (int k = 0; k < 4; k++) {
                int nx = cur[0] + dx[k];
                int ny = cur[1] + dy[k];
                
                if (nx >=0 && ny >= 0 && 
                    nx < maps.length && ny < maps[0].length &&
                    !visited[nx][ny] && maps[nx][ny] == 1
                   )
                {
                    visited[nx][ny] = true;
                    maps[nx][ny] += maps[cur[0]][cur[1]]; 
                    q.offer(new int[] {nx, ny});
                    
                    if (nx == maps.length - 1 && ny == maps[0].length - 1) {
                        return maps[nx][ny];
                    }
                }
            }
        }
        
        return -1;
    }
    
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        int answer = bfs(0, 0, maps);
        
        return answer;
    }
}