class Solution {
    public int solution(String s) {
        int answer = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            int a = 1;
            int b = 0;
            
            int idx = i+1;
            
            while (a != b && idx < s.length()) {
                if (c == s.charAt(idx)) {
                    a++;
                } else {
                    b++;
                }
                
                idx++;
            }
            
            answer++;
            i = idx - 1;
        }
        
        return answer;
    }
}