class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
    
        for (int h = 0; h <= n; h++) {
            
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (h <= citations[i]) cnt++;
            }
            
            if (cnt >= h) {
                answer = Math.max(answer, h);
            }
        }
        
        return answer;
    }
}