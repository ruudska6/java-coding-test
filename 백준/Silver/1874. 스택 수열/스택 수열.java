import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int p = 0;
		boolean flag = true;
		for(int i = 1; i <= n; i++) {
			stack.push(i);
			sb.append("+").append("\n");
			
			
			while(!stack.isEmpty() && stack.peek() == arr[p]) {
					stack.pop();
					p++;
					sb.append("-").append("\n");
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println(sb.toString());
		} else {
			System.out.println("NO");
		}

	
		

	}
}
