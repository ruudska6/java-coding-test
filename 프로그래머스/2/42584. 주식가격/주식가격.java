class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            boolean isDowned = false;
            int s = 0;
            for (int j = i + 1; j < prices.length; j++) {
                s++;
                if (prices[i] > prices[j]) {
                    isDowned = true;
                    break;
                }
            }
            
            answer[i] = s;
        }
        
        return answer;
    }
}