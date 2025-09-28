import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] cabbage;
    static boolean[][] visited;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};
    static int M,N,K;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int j = 0; j < T; j++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            visited = new boolean[M][N];
            cabbage = new int[M][N];

            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine(), " ");
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                cabbage[X][Y] = 1;
            }


            for (int l = 0; l < M; l++) {
                for(int m = 0; m < N; m++) {
                    if (cabbage[l][m] == 1 && !visited[l][m]) {
                        dfs(l,m);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx >= 0 && cy >= 0 && cx < M && cy < N) {
                if(!visited[cx][cy] && cabbage[cx][cy] == 1) {
                    dfs(cx,cy);
                }

            }
        }




    }
}
