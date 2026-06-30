class Solution {
    static boolean[] visited;
    static int answer = Integer.MAX_VALUE;
    
    static void dfs(int depth, String begin, String target, String[] words) {
        if (begin.equals(target)) {
            answer = Math.min(answer, depth);
            return;
        }
                
        else {
            for (int i = 0; i < words.length; i++) {
                if (isOneDiff(begin, words[i]) && !visited[i]) {
                    visited[i] = true;
                    dfs(depth + 1, words[i], target, words);
                    visited[i] = false;
                }
            }
        }
        
        return;
    }
    
    static boolean isOneDiff(String str, String target) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != target.charAt(i)) {
                cnt++;
            }
        }
        
        if (cnt == 1) return true;
        return false;
    }
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        dfs(0, begin, target, words);
        
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}