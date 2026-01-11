import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		

		StringTokenizer st;
		st =  new StringTokenizer(br.readLine()," "); 
		

		int count = 0;
		
		for (int i=0; i< arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i=0; i< arr.length; i++) { 
			for (int j=1; j < arr.length; j++) {
				int sum = 0;
				if (arr[i]== arr[j]) {
					break;
				}
				else {
				sum = arr[i] + arr[j];
				if (sum == M) {
					count++;					
				}
				}
			}
				
		}
		System.out.println(count);
		
		
		
		
	}
}


