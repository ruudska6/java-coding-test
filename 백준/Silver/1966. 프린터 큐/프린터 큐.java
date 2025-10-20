import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            Queue<Integer[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                int importance = Integer.parseInt(st.nextToken());
                q.offer(new Integer[]{i, importance});
            }

            int cnt = 0;
            while (!q.isEmpty()) {
                Integer[] cur = q.poll();

                boolean isMax = true;
                for (Integer[] curr : q) {
                    if (cur[0] != curr[0]) {
                        if (cur[1] < curr[1]) {
                            isMax = false;
                            break;
                        }
                    }
                }

                if (isMax) {
                    cnt++;
                    if (cur[0] == M) break;
                } else {
                    q.offer(cur);
                }
            }

            System.out.println(cnt);
        }
    }
}
