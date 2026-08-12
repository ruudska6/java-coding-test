import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 이름, 명수를 map에 저장
        Map<String, Integer> map = new HashMap<>();
        
        // map에 등록
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], 
                    map.getOrDefault(participant[i], 0) + 1);
        }
        
        // 완주자 명단 순회하면서 완주자 제거
        for (String name : completion) {
            // 동명이인 제거 
            map.put(name, map.get(name) - 1);
            if (map.get(name) == 0) map.remove(name);
        }        
        
        // map에 남아있는 사람 출력
        for (String name : map.keySet()) {
            answer = name;
        }
    
        return answer;
    }
}