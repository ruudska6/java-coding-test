import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queueStack = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        int[] choice = new int[n];
        for (int i = 0; i < n; i++) {
            choice[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (choice[i] == 0) {
                queueStack.offerLast(num);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            queueStack.offerFirst(num);
            sb.append(queueStack.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
