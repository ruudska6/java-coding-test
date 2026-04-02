import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        Map <Character, Integer> map = new HashMap<>();
        for (int i = 0; i < skip.length(); i++) {
            map.put(skip.charAt(i), 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            // a를 꺼내고
            char ch = s.charAt(i);
            
            // index만큼 증가 시킴
                int count = 0;
                while (count < index) {
                    if (ch < 'z') {
                        ch++;
                    } else {
                        ch = 'a';
                    }
                    
                    if (!map.containsKey(ch)) {
                        count++;
                    }
                }
                
                answer += String.valueOf(ch);
            }
            

        
        return answer;
    }
}