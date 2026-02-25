import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // 무게가 작은 순서대로 정렬
        Arrays.sort(people);
        
        int light = 0;
        int heavy = people.length - 1;
        
        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit) {
                answer++;
                light++;
                heavy--;
            } else {
                answer++;
                heavy--;
            }
        }
    
        
        return answer;
    }
}