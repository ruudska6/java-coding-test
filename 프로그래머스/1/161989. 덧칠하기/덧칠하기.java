class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] wall = new int[n+1];
        for (int i = 0; i < section.length; i++) {
            wall[section[i]] = -1;
        }
    
        for (int i = 0; i < section.length; i++) {
            int b = section[i];
            
            if (wall[b] == 1) continue;
            
            for (int j = b; j < b + m && j <= n; j++) {
                wall[j] = 1;      
            }
            
            answer++;
        }
        
        return answer;
    }
}