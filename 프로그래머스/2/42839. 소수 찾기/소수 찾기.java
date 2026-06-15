import java.util.*;

class Solution {
    static Set<Integer> set;
    static boolean[] visited;
    
    private static void dfs(String k, String numbers) {
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
    
    private static boolean isPrime(int number) {
        if (number < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        
        return true;
    }
    
    public int solution(String numbers) {
        int answer = 0;
        
        List<Integer> nums = new ArrayList<>();
        set = new HashSet<>();
        visited = new boolean[numbers.length()];
        
        dfs("", numbers);
        
        for (int x : set) {
            if (isPrime(x)) answer++;
        }
        
        return answer;
    }
    
    
}