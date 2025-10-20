import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> deque = new LinkedList<>();

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int[] arr = new int[M];

        for (int i = 0; i < M; i++) {
            arr[i] = scanner.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            while(true) {
                int targetIdx = deque.indexOf(arr[i]);
                int halfIdx = deque.size() / 2;

                int first = deque.peekFirst();

                if (first != arr[i]) {
                    if (targetIdx <= halfIdx) {
                        int temp = deque.pollFirst();
                        deque.offerLast(temp);
                        cnt++;
                    } else {
                        int temp = deque.pollLast();
                        deque.offerFirst(temp);
                        cnt++;
                    }
                } else {
                    deque.pollFirst();
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}