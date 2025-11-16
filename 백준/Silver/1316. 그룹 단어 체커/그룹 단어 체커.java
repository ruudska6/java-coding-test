import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		
		String[] words = new String[N];
		int count = 0;
		for (int i = 0; i < N; i++) {
			words[i] = scanner.nextLine();
				
			boolean[] check = new boolean[26];
			
			char prev = words[i].charAt(0);
			check[prev - 'a'] = true;
			
			boolean flag = true;
			
			for (int j = 1; j < words[i].length(); j++) {
				char now = words[i].charAt(j);
				
				if (prev != now) {
					if (check[now -'a'] == true) {
						flag = false;
						break;
					}
					
					check[now-'a'] = true;
					prev = now;
				} 
			}
			if (flag) count++;
		}
		
		System.out.println(count);
	}
}
