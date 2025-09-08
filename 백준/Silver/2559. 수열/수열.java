import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int[] sumArr = new int[n];
        sumArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sumArr[i] = arr[i] + sumArr[i - 1];
        }

        int max = sumArr[k - 1];
        for (int i = k; i < n; i++) {
            int cur = sumArr[i] - sumArr[i - k];
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }
}
