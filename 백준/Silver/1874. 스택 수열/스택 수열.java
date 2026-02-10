import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int now = 1;
        boolean isSequence = true;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (now <= num) {
                while (now != num) {
                    stack.push(now++);
                    sb.append("+").append("\n");
                }

                stack.push(now++);
                sb.append("+").append("\n");

            } else if (now > num) {
                if (!stack.isEmpty()) {
                    int top = stack.pop();
                    sb.append("-").append("\n");
                    if (top == num) {
                        continue;
                    } else {
                        isSequence = false;
                        break;
                    }
                } else {
                    isSequence = false;
                    break;
                }
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        if (!isSequence) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}
