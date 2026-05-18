class Solution {
    
    static int answer;
    
    private static void dfs(int[] numbers, int target, int k, 
                            int sum) {
        if (k == numbers.length) {
            if (sum == target) answer++;
        }
        else {
            dfs(numbers, target, k + 1, sum + numbers[k]);       
            dfs(numbers, target, k + 1, sum - numbers[k]);
        }
    }
    
    public int solution(int[] numbers, int target) {
    
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
}