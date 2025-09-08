
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	
	int N = Integer.parseInt(st.nextToken());
	int M = Integer.parseInt(st.nextToken());
	
	int[] numbers = new int[N];
	int[] snumbers = new int[N];
	
	st = new StringTokenizer(br.readLine()," ");
	
	for (int i =0; i < N; i++) {		
		numbers[i] = Integer.parseInt(st.nextToken());
	}
	
	for (int i =1; i < N; i++) {
		snumbers[0] = numbers[0]; 
		snumbers[i] = snumbers[i-1] + numbers[i];
		// 합 배열 만듦.
	}
	

	for (int i = 0; i < M; i++ ) {
		st = new StringTokenizer(br.readLine()," ");
		int indexI = Integer.parseInt(st.nextToken()) -1 ; // 1
		int indexJ = Integer.parseInt(st.nextToken()) -1; // 3

		if (indexI-1 < 0) {
			int sum = snumbers[indexJ];  
			System.out.println(sum);
		}
		else { int sum = snumbers[indexJ] - snumbers[indexI - 1];
		System.out.println(sum);}
			
	
	}




	


	

	
	
	
	
	
	}
}
	
