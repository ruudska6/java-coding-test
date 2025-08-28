import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> numbers = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            if (command.equals("1")) {
                int number = scanner.nextInt();
                numbers.addFirst(number);
            } else if (command.equals("2")) {
                int number = scanner.nextInt();
                numbers.addLast(number);
            } else if (command.equals("3")) {
                if (numbers.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    int number = numbers.removeFirst();
                    sb.append(number).append("\n");
                }
            } else if (command.equals("4")) {
                if (numbers.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    int number = numbers.removeLast();
                    sb.append(number).append("\n");
                }
            } else if (command.equals("5")) {
                int numberCount = numbers.size();
                sb.append(numberCount).append("\n");
            } else if (command.equals("6")) {
                if (numbers.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (command.equals("7")) {
                if (numbers.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    int number = numbers.peekFirst();
                    sb.append(number).append("\n");
                }
            } else if (command.equals("8")) {
                if (numbers.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    int number = numbers.peekLast();
                    sb.append(number).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
