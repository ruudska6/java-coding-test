import java.util.Scanner;
import java.util.Stack;


public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++) {
			
			String str = sc.next();
			boolean err = false;
			Stack <Character> stack = new Stack<>();
			
			for (int j=0; j< str.length();j++) {
				char ch = str.charAt(j);
				if (ch == '(') {
					stack.push(ch);
				}
				else if(ch == ')') {
					if (stack.isEmpty()) {
						err = true; 
						break;
					}
					else stack.pop();
				}
			}
			
			
			if(!stack.isEmpty() || err) {
				System.out.println("NO");
			}
			else if (stack.isEmpty()) {
				System.out.println("YES");
			}
		}
		sc.close();
		
	}
}
