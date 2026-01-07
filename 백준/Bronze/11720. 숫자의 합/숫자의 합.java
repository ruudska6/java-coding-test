
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] numbers = new int[N];
		String str = sc.next();
		int sum = 0;
		
		for (int i=0; i<N; i++) {
			numbers[i] = str.charAt(i) -'0';
			sum += numbers[i];
			
		}
		sc.close();
		System.out.println(sum);
	}
}
