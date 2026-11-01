import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> ps = new HashMap<>();
        for (String p : participant) {
            ps.put(p, ps.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            
            if (ps.containsKey(c)) {
                ps.put(c, ps.get(c) - 1);
            }
        }
        
        for (String s : ps.keySet()) {
            if (ps.get(s) > 0) answer = s;            
        }
            
        return answer;
    }
}