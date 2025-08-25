import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++){
            left.push(s.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            if (command.equals("L")) {
                if (!left.isEmpty()) right.push(left.pop());
            } else if (command.equals("D")){
                if (!right.isEmpty()) left.push(right.pop());
            } else if (command.equals("B")){
                if (!left.isEmpty()) left.pop();
            } else if (command.equals("P")){
                left.push(st.nextToken().charAt(0));
            }
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (!left.isEmpty()) {
            sb1.append(left.pop());
        }

        sb1.reverse();

        while (!right.isEmpty()) {
            sb2.append(right.pop());
        }

        System.out.println(sb1.toString() + sb2.toString());
    }
}
