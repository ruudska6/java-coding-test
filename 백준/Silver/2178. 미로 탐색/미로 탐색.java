import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int n,m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x =  now[0];
            int y = now[1];

            for (int k = 0; k < 4; k++) {
                int nx = dx[k] + x;
                int ny = dy[k] + y;

                if (nx >= 1 && ny >= 1 && nx <= n && ny <= m && map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                    map[nx][ny] = map[x][y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 1; j <= m; j++) {
                map[i][j] = s.charAt(j-1) - '0';
            }
        }

        bfs(1,1);
        System.out.println(map[n][m]);

    }
}
