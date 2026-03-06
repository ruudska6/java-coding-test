class Solution {
    
    static int count;
    
    public int solution(int a, int b, int n) {
        
        dfs(a, b, n);
        
        return count;
    }
    
    private static void dfs(int give, int take, int n) {
        if (n < give) return;
        else {
            int change = n / give;
            count += change * take;
            int remain = n % give;
            
            dfs(give, take, change * take + remain);        
        }
    }
}