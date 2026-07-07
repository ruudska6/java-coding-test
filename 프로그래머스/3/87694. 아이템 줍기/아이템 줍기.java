import java.util.*;

class Solution {
    
    static int[][] map = new int[102][102];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited = new boolean[102][102];
    static int[][] dist = new int[102][102];
    
    static void bfs(int x, int y, int fx, int fy) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        visited[x][y] = true;
        
        while (!q.isEmpty()) {
            int[] now = q.poll();
            
            if (now[0] == fx && now[1] == fy) return;
            
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                
                if (nx >= 0 && nx <= 101 && ny >= 0 && ny <= 101 && !visited[nx][ny] && map[nx][ny] == 1) {
                    q.offer(new int[] {nx, ny});
                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[now[0]][now[1]] + 1;
                }
            }
        }
    }
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0; 
        

    for (int[] r : rectangle) {
        int x1 = r[0] * 2;
        int y1 = r[1] * 2;
        int x2 = r[2] * 2;
        int y2 = r[3] * 2;

        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {

                if (x > x1 && x < x2 && y > y1 && y < y2) {
                    map[x][y] = 2;
                }

                else {
                    if (map[x][y] != 2) {
                        map[x][y] = 1;
                    }
                }
            }
        }
    }
        
        bfs(characterX * 2, characterY * 2, itemX * 2, itemY * 2);
        answer = dist[itemX * 2][itemY * 2] / 2;
        return answer;
    }
}