class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int lt = 0;
        int sum = 0;
        int len = 0;
        int minLen = 1000001;
        for (int rt = 0; rt < sequence.length; rt++) {
            sum += sequence[rt];
                        
            while (sum > k) {
                sum -= sequence[lt];
                lt++;
            }
            
            if (sum == k) {
                len =  rt - lt + 1;
                
                if (minLen > len) {
                    minLen = len;
                    answer = new int[] {lt, rt};
                }
            } 
        }

        
        return answer;
    }
}