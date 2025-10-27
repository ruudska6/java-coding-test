class Solution {
    static int N,S;
    static int[] arr;
    static int count;
    
    public int solution(int[] numbers, int target) {
        N = numbers.length;
        S = target;
        arr = numbers;
        dfs(0, 0);
        
        return count;
    }
    
    static void dfs(int depth, int s) {
        if (depth == N) {
            if (s == S) {
                count++;
                return;
            }
        } else {
            dfs(depth + 1, s + arr[depth]);
            dfs(depth + 1, s - arr[depth]);
        }
    }
}