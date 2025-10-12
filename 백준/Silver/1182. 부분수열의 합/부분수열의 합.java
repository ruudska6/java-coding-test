import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,s;
    static int cnt;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        if (s == 0) System.out.println(cnt - 1);
        else System.out.println(cnt);
    }

    private static void dfs(int depth, int sum) {
        if (depth == n) {
            if (sum == s) {
                cnt++;
                return;
            }

        } else {
            dfs(depth + 1, sum + arr[depth]);
            dfs(depth + 1, sum);
        }
    }
}
