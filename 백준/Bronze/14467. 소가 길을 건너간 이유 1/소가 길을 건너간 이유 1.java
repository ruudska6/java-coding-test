import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cows = new int[11];
        Arrays.fill(cows, -1);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());

            if (cows[number] == -1) {
                cows[number] = location;
            } else if (cows[number] != location) {
                cnt++;
                cows[number] = location;
            }
        }

        System.out.println(cnt);
    }
}
