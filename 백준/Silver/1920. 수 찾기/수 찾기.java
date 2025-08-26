import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		String[] input = br.readLine().split(" ");
	
        for (int i =0; i<N; i++) {
		arr1[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(arr1);
        
		int M = Integer.parseInt(br.readLine());
		int[] arr2 = new int[M];
		String[] input2 = br.readLine().split(" ");
	
		for (int i =0; i<M; i++) {
		arr2[i] = Integer.parseInt(input2[i]);
		}

		for(int i =0; i<M; i++) {
			System.out.println(BinarySearch2(arr1, arr2[i], 0, N-1));
			
		}
		
	}
		
		
		
	static int BinarySearch2(int[] arr,int key, int low, int high) {
			
	if (low <= high) {
		int mid = (low + high) / 2;
		
		if (arr[mid] == key) {
			return 1;
		}
		else if (arr[mid] > key) {
			return BinarySearch2(arr, key, low, mid - 1);
		}
		
		else if (arr[mid] < key) {
			return BinarySearch2(arr,key, mid + 1, high);
		}		
	}
	
	return 0;		
}
}
