import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};


        int[][] arr = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        Queue<Pair> q = new LinkedList<Pair>();

        for(int i = 0; i < n ; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int max = 0;
        int area = 0;

        for (int i= 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 0 || visited[i][j]) {
                    continue;
                }

                count++;
                q.offer(new Pair(i, j));
                visited[i][j] = true;
                area = 0;

                while(!q.isEmpty()) {
                    Pair pair = q.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int n_x = pair.x + dx[k];
                        int n_y = pair.y + dy[k];
                        if (n_x < 0 || n_x >= n || n_y < 0 || n_y >= m)
                            continue;

                        if (arr[n_x][n_y] == 1 && !visited[n_x][n_y]) {
                            q.offer(new Pair(n_x, n_y));
                            visited[n_x][n_y] = true;
                        }
                    }
                }

                if (area > max) {
                    max = area;
                }

            }

        }

        System.out.println(count);
        System.out.println(max);

    }
}


class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
