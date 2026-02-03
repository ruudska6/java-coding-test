import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        // i가 소수인지 판별하려면...
        for (int i = M; i <= N; i++) {
            if (i < 2) {
                continue;
            }
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrt; j++ ) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
