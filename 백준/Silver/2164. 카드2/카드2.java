import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int count = 1;
        while(q.size() != 1) {
            if(count++ % 2 == 1) {
                q.poll();
            } else {
                q.add(q.poll());
            }
        }

        System.out.println(q.peek());

    }
}
