import java.util.*;

class Solution {
    public int solution(String s) {
        
        Map<String, Integer> dict = new HashMap<>();
        dict.put("zero", 0);
        dict.put("one", 1);
        dict.put("two", 2);
        dict.put("three", 3);
        dict.put("four", 4);
        dict.put("five", 5);
        dict.put("six", 6);
        dict.put("seven", 7);
        dict.put("eight", 8);
        dict.put("nine", 9);

        for (String num : dict.keySet()) {
            s = s.replace(num, String.valueOf(dict.get(num)));
        }
        
        return Integer.parseInt(s);
    }
}