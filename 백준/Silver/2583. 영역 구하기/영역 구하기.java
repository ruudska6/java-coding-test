import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int m,n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int cnt;

    static void dfs(int row, int col) {
        visited[row][col] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = col + dc[i];
            if (nr >= 0 && nc >= 0 && nr < m && nc < n) {
                if (map[nr][nc] == 0 && !visited[nr][nc]) {
                    dfs(nr, nc);
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m  = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        map = new int[m][n];
        visited = new boolean[m][n];

        List<Integer> areas = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            int x1  = Integer.parseInt(st.nextToken());
            int y1  = Integer.parseInt(st.nextToken());
            int x2  = Integer.parseInt(st.nextToken());
            int y2  = Integer.parseInt(st.nextToken());

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    dfs(i, j);
                    areas.add(cnt);
                    cnt = 0;
                }
            }
        }

        Collections.sort(areas);
        System.out.println(areas.size());
        for (int i = 0; i < areas.size(); i++) {
            System.out.print(areas.get(i) + " ");
        }
    }
}
