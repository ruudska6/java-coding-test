import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        Map<String, Boolean> check = new HashMap<>();
        
        char lastWord = words[0].charAt(words[0].length() - 1);
        check.put(words[0], true);
        
        for (int i = 1; i < words.length; i++) {
            if (check.containsKey(words[i])) {
                answer[0] = (i % n) + 1; 
                answer[1] = (i / n) + 1;
                return answer;
            }
            check.put(words[i], true);
            
            if(words[i].charAt(0) != lastWord) {
                answer[0] = (i % n) + 1; 
                answer[1] = (i / n) + 1;
                return answer;
            }
            
            lastWord = words[i].charAt(words[i].length() - 1);
        }
        
        return new int[]{0, 0};
    }
}