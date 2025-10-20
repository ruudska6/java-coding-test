import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] chessBoard;
    static boolean[][] visited;
    static int I;
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
    static int destX;
    static int destY;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int t = 0; t < T; t++) {
            I = Integer.parseInt(br.readLine());
            chessBoard = new int[I][I];
            visited = new boolean[I][I];

            st = new StringTokenizer(br.readLine());
            int curX = Integer.parseInt(st.nextToken());
            int curY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            destX = Integer.parseInt(st.nextToken());
            destY = Integer.parseInt(st.nextToken());
            chessBoard[destX][destY] = 1;

            sb.append(bfs(curX, curY)).append("\n");
        }

        System.out.println(sb);
    }

    private static int bfs(int curX, int curY) {

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{curX, curY});
        visited[curX][curY] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 &&  ny >= 0 && nx < I && ny < I && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    chessBoard[nx][ny] = chessBoard[x][y] + 1;

                    if (nx == destX && ny == destY) {
                        return chessBoard[nx][ny];
                    }

                    q.offer(new int[]{nx, ny});

                }
            }
        }
        return 0;
    }
}
