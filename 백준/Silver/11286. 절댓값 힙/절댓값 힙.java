import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int i1 = Math.abs(o1);
            int i2 = Math.abs(o2);

            if (i1 == i2) return o1 > o2 ? 1 : -1;
            else return i1 - i2;
        });

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0)
                pq.offer(num);
            else {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
