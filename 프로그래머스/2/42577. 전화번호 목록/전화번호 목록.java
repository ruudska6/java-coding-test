import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        boolean answer = true;
        
        Map<String, Integer> list = new HashMap<>();
        
        for (int i = 0; i < phone_book.length; i++) {
            list.put(phone_book[i], 1);
        }
        
        for (int i = 0; i < phone_book.length; i++) {
            String target = phone_book[i];
            
            for (int j = 1; j < target.length(); j++) {
                String prefix = target.substring(0, j);
                
                if (list.containsKey(prefix)) {
                    answer = false;
                }
            }
            
        }
        
        
        
        
        return answer;
    }
}