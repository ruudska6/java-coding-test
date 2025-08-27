import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();


        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        sb.append("<");
        while(q.size() != 1) {
            for(int i = 1; i < K; i++) {
                q.add(q.poll());
            }

            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll());
        sb.append(">");

        System.out.println(sb.toString());

    }

}
