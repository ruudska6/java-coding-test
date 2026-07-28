class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        
        int denom3 = denom1 * denom2;
        numer1 = numer1 * denom2;
        numer2 = numer2 * denom1;
        
        // 1/2 + 3/4 = 4/8 + 6/8 = 10/8 = 5/4 
        // 9/2 + 1/3 = 27/6 + 2/6 = 29/6
        int numer3 = numer1 + numer2;
        
        int gcd = 1;

        for (int i = 1; i <= Math.min(numer3, denom3); i++) {
            if (numer3 % i == 0 && denom3 % i == 0) {
                gcd = i;
            }
        }

        answer[0] = numer3 / gcd;
        answer[1] = denom3 / gcd;
    
        return answer;
    }
}