import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            char first = Character.toUpperCase(str1.charAt(i));
            char second = Character.toUpperCase(str1.charAt(i + 1));

            if (first >= 'A' && first <= 'Z'
                    && second >= 'A' && second <= 'Z') {

                String word = String.valueOf(first) + second;
                map1.put(word, map1.getOrDefault(word, 0) + 1);
            }
        }
        
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str2.length() - 1; i++) {
            char first = Character.toUpperCase(str2.charAt(i));
            char second = Character.toUpperCase(str2.charAt(i + 1));

            if (first >= 'A' && first <= 'Z'
                    && second >= 'A' && second <= 'Z') {

                String word = String.valueOf(first) + second;
                map2.put(word, map2.getOrDefault(word, 0) + 1);
            }
        }
        
        //합집합
        Map<String, Integer> map3 = new HashMap<>();
        for (String word : map1.keySet()) {
            map3.put(word, map1.get(word));
        }
        
        for (String word : map2.keySet()) {
            map3.put(word, 
                Math.max(map1.getOrDefault(word, 0),
                    map2.get(word)
                )
            );
        }
            
        //교집합
        Map<String, Integer> map4 = new HashMap<>();
        for (String word : map1.keySet()) {
            if (map2.containsKey(word)) {                         
                map4.put(word, 
                    Math.min(map1.getOrDefault(word, 0), 
                             map2.getOrDefault(word, 0))
                );
             }
        }

        int unionCount = 0;
        for (int count : map3.values()) {
            unionCount += count;
        }
        
        if (unionCount == 0) {
            return 65536;
        }
        
        int interCount = 0;
        for (int count : map4.values()) {
            interCount += count;
        }
        
        return interCount * 65536 / unionCount;
    }
}