import java.util.*;

class Solution {
    static String[] arr;
    static boolean[] visited;
    static Set<Integer> nums = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        arr = new String[numbers.length()];
        visited = new boolean[numbers.length()];
        dfs("", numbers, 0);
        
        for (int num : nums) {
            if (isPrime(num)) {
                answer++;
            }
        }
        return answer;
    }
    
    private void dfs(String now, String numbers, int depth) {
        if (depth == numbers.length()) {
            return;
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;                
                nums.add(Integer.parseInt(now + numbers.charAt(i)));
                dfs(now + numbers.charAt(i), numbers, depth + 1);    
                visited[i] = false;
            } 
       
        }
    }
    
    private static boolean isPrime(int number) {
        
        if (number < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            } 
        }
        
        return true;
    }
}