import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> wants = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wants.put(want[i], number[i]);
        }
        
        for (int i = 0; i < discount.length - 9; i++) {
            Map<String, Integer> fruits = new HashMap<>();
            for (int j = i; j < 10 + i; j++) {
                fruits.put(discount[j], fruits.getOrDefault(discount[j], 0) + 1);
            }
            
            boolean enough = true;
            for (String w : wants.keySet()) {
                if (wants.get(w) <= fruits.getOrDefault(w, 0)) {
                    continue;
                } else {
                    enough = false;
                    break;
                }
            }
            
            if (enough) answer++;
        }
        
        return answer;
    }
}