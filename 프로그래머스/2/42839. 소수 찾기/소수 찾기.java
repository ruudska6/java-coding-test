import java.util.*;

class Solution {
    static Set<Integer> set;
    static boolean[] visited;
    
    private void dfs(String k, String numbers) {
        if (!k.isEmpty()) {
            set.add(Integer.parseInt(k));
        }
        
        if (k.length() == numbers.length()) return;

        for (int i = 0; i < numbers.length(); i++) { 
            if (!visited[i]) {
                visited[i] = true;
                dfs(k + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }
    
    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    public int solution(String numbers) {
        int answer = 0;
        
        set = new HashSet<>();
        visited = new boolean[numbers.length()];
        
        dfs("", numbers);
        
        for (int x : set) {
            if (isPrime(x)) answer++;
        }
        
        return answer;
    }
}