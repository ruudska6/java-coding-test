class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        

        //max를 한쪽 잡아둚.
        int maxLen = 0;
        for (int i = 0; i < sizes.length; i++) {
            for(int j = 0; j < sizes[i].length; j++) {
                maxLen = Math.max(maxLen, sizes[i][j]);
            }
        }
        
        int maxMinLen = 0;
        // 더 짧은 쪽을 택해서 큰걸 찾음
        for (int i = 0; i < sizes.length; i++) {
            int minLen = 0;
            minLen = Math.min(sizes[i][0], sizes[i][1]);
            
            maxMinLen = Math.max(maxMinLen, minLen);
        }
        
        
        return maxLen * maxMinLen;
    }
}