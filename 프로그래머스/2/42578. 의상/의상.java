import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> inventory = new HashMap<>(); 
        
        for (int i = 0; i < clothes.length; i++) {
            inventory.put(clothes[i][1], inventory.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        
        for (String x : inventory.keySet()) {
            answer *= inventory.get(x) + 1;
        }
       
        return answer - 1;
        
    }
}