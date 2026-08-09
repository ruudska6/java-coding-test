class Solution {
    
    static char[] vowels = {'A', 'E', 'I', 'O', 'U'}; 
    static int cnt = 0;
    static int answer; 
    
    public int solution(String word) {
            
        dfs("", word);
        
        return answer;
    }
    
    private void dfs(String now, String word) { 

        if (now.equals(word)) {
            answer = cnt;
            return;
        } 

        if (now.length() == 5) return;
        
        for (char c : vowels) {
            cnt++;
            dfs(now + c, word);
        }
        
        return;
    }
}