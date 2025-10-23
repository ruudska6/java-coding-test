import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.offerLast(i);
        }

        while (deque.size() > 1) {

            System.out.print(deque.pollFirst() + " ");

            Integer temp = deque.pollFirst();
            deque.offerLast(temp);
        }

        System.out.println(deque.poll());
    }
}
