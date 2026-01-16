import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 1;
        
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();

            if (num <= input) {
                while(num <= input) {
                    stack.push(num++);
                    sb.append("+").append("\n");
                }

                stack.pop();
                sb.append("-").append("\n");
            } else {
                int top = stack.pop();
                if (top == input) {
                    sb.append("-").append("\n");
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        
        System.out.println(sb);
    }
}
