import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    static int N;
    static char[][] map;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void dfs(int x, int y, char color) {
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{x, y});
        visited[x][y] = true;

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny]) {
                        if(map[nx][ny] == color) {
                            visited[nx][ny] = true;
                            stack.push(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        int area = 0;
        char[] colors = {'R' , 'G', 'B'};
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < colors.length; k++) {
                    if (!visited[i][j] && map[i][j] == colors[k]) {
                        dfs(i, j, colors[k]);
                        area++;
                    }
                }
            }
        }

        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'G') map[i][j] = 'R';
            }
        }

        char[] cbColors = {'R' , 'B'};
        int area2 = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < cbColors.length; k++) {
                    if (!visited[i][j] && map[i][j] == cbColors[k]) {
                        dfs(i, j, cbColors[k]);
                        area2++;
                    }
                }
            }
        }

        System.out.println(area + " " + area2);
    }
}
