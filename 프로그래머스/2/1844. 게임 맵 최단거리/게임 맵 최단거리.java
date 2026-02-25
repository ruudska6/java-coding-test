import java.util.*;

class Solution {
    
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    static void bfs(int x, int y) {
        int answer = 0;

        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        q.offer(new int[] {x, y});
        
        while (!q.isEmpty()) {
            int[] now = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < map.length 
                       && ny < map[0].length && !visited[nx][ny] && map[nx][ny] == 1) {
                    q.offer(new int[] {nx, ny});
                    visited[nx][ny] = true;
                    map[nx][ny] = map[now[0]][now[1]] + 1;
                }
            }
            
        }
    }
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        map = maps;
        visited = new boolean[maps.length][maps[0].length];
        bfs(0, 0);
        
        answer = map[maps.length-1][maps[0].length-1];
        
        if (answer == 1) answer = -1;
        return answer;
    }
}