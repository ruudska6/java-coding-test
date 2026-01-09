import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] numbers = new int[N];
		double [] jujakNumbers = new double[N];
		double sum = 0.0;
		int max =0;
		
		for (int i=0; i<N; i++) {
			numbers[i] = sc.nextInt();
			// 최대 점수 고르기
		}
			
		for (int i=0; i < N; i++) {
			if (max < numbers[i]) max = numbers[i];
			
		}
		for (int i=0; i < N; i++) {
			
			jujakNumbers[i] = ((double) numbers[i] / max) * 100;
			sum += jujakNumbers[i];
		}
		sc.close();
		System.out.println(sum / N);
	}
}
