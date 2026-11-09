import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        
        
        Arrays.sort (answer, (a, b) -> {
            
            int result = Character.compare(a.charAt(n), b.charAt(n));
        
            if (result == 0) {
                return a.compareTo(b);
            }
            
            return result;
        });
        
        return answer;
    }
}