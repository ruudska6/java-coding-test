class Solution {
    static int min = Integer.MAX_VALUE;
    static boolean[] visited;
    static int cnt;
    
    public int solution(String begin, String target, String[] words) {

        visited = new boolean[words.length];
        dfs(begin, target, words);
        
        if (min == Integer.MAX_VALUE) return 0;
        return min;
    }
    
    
    private void dfs(String now, String target, String[] words) {

        System.out.print(now + " -> ");
        
        if (now.equals(target)) {
            if (min > cnt) {
                min = cnt;
            }
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (!visited[i]) {
                if (isOneDiff(now, words[i])) {
                    visited[i] = true;
                    cnt++;
                    dfs(words[i], target, words);
                    cnt--;
                    visited[i] = false;
                }
            }
        }
    } 
    
    private static boolean isOneDiff(String s, String target) {
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != target.charAt(i)) {
                cnt++;
            }
        }
        
        if (cnt == 1) return true; 
        return false;
    }
}