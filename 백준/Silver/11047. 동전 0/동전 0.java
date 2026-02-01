import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] coins = new int[N];

            for (int i =0; i < N; i++) {
                coins[i] = Integer.parseInt(br.readLine());
            }

            int count = 0;
            int prevSum = 0;

            for (int i= N-1; i > -1 ; i--)  {
                if(coins[i] <= K) {
                    count = count + K / coins[i];
                    K = K % coins[i];
                }

            }

            System.out.println(count);
        }
    }

