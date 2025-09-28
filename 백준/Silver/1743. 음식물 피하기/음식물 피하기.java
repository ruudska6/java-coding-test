import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static boolean[][] visited;
    static int[][] map;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int component = 0;

    static void dfs(int x, int y) {
        component++;
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nr = x + dr[i];
            int nc = y + dc[i];
            if (nr > 0 && nc > 0 && nr <= n && nc <= m) {
                if (map[nr][nc] == 1 && !visited[nr][nc]) {
                     dfs(nr, nc);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1][m+1];
        map = new int[n+1][m+1];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            map[row][col] = 1;
        }

        int max = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] == 1) {
                    dfs(i, j);
                    max = Math.max(max, component);
                    component = 0;
                }
            }
        }

        System.out.println(max);
    }
}
