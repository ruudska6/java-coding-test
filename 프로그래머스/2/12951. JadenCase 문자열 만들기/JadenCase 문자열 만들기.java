import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
            
        boolean isFirst = true;        
        for (int i = 0; i < s.length(); i++) {
            
            if (Character.isWhitespace(s.charAt(i))) {
                isFirst = true;
                answer += " ";
                continue;
            }
            
            if (isFirst) {
                isFirst = false;
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    answer += 
                        String.valueOf(Character.toUpperCase(s.charAt                          (i)));
                } else {
                    answer += String.valueOf(s.charAt(i));
                }
            } else {
                answer += 
                    String.valueOf(Character.toLowerCase(s.charAt                          (i)));
                }
        

        }
         return answer;
    }   
}