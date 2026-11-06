import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String sNum = String.valueOf(n);
        
        StringBuilder sb = new StringBuilder(sNum);
        String reversed = sb.reverse().toString();
        
        int[] answer = new int[sNum.length()];
        for (int i = 0; i < sNum.length(); i++) {
            answer[i] = reversed.charAt(i) - '0';
        }
        
        return answer;
    }
}