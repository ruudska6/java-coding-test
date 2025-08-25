import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	static BigInteger memo[];
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		memo = new BigInteger[n+1];

		fibo(n);
		
		System.out.println(memo[n]);
		
	}
	
	public static BigInteger fibo(int n) {
		if (n == 0) return memo[n] = BigInteger.ZERO;
		if(memo[n] != null) return memo[n];
		if(n == 1) return memo[n] = BigInteger.ONE;
		else if (n == 2) return memo[n] = BigInteger.ONE;
		else {
			return memo[n] = fibo(n-2).add(fibo(n-1));
		}
	}

}
