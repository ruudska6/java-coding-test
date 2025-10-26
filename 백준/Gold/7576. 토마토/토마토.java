import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static Queue<int[]> q = new LinkedList<int[]>();
    static int[][] box;
    static boolean[][] visited;
    static int N;
    static int M;
    static int[] dx =  {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int day = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1 && !visited[i][j]) {
                    q.add(new int[] {i, j, 0});
                    visited[i][j] = true;
                }
            }
        }

        bfs();

        boolean isDone = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && box[i][j] == 0) {
                    isDone = false;
                }
            }
        }

        if (isDone) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }

    }

    private static void bfs() {
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            day = cur[2];

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny] && box[nx][ny] == 0) {
                    visited[nx][ny] = true;
                    q.add(new int[] {nx, ny, day + 1});
                }
            }
        }

    }
}
