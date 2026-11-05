import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[] {0, 0};
        
        Set<String> set = new HashSet<>();
        
        char last = ' ';
        
        int num = 1;
        int turn = 1;
        for (int i = 0; i < words.length; i++) {
            // 첫번째는 스킵
            if (i == 0) {
                last = words[i].charAt(words[i].length() - 1);
                set.add(words[i]);
                continue;
            } 
            
            if (set.contains(words[i])) {
              return new int[] {i % n + 1, i / n + 1};
            } 
    
            if (last != words[i].charAt(0)) {
                return new int[] {i % n + 1, i / n + 1};
            }          
    
            set.add(words[i]); 
            last = words[i].charAt(words[i].length() - 1);
        }
        
        return answer;
    }
}