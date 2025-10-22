import java.util.*;

class Solution {
    public String solution(String s) {
      
        String[] arr = s.split(" ", -1);
        
        StringBuilder sb = new StringBuilder();
        
        String answer = "";
        
        boolean isStart = true;
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == ' ') {
                sb.append(" ");
                isStart = true;
            } else {
                if (isStart) {
                    sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                    isStart = false;
                } else {
                    sb.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
                
            }
        }
        
            answer = sb.toString();
            return answer;
    }
}