import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> rankings = new ArrayList<>();
        rankings.add(score[0]);
        
        answer[0] = score[0];
        int a = 1;
        
        for (int day = 1; day < score.length; day++) {
            
            Collections.sort(rankings);

            if (rankings.size() >= k) {
                if (score[day] >= rankings.get(0)) {
                rankings.set(0, score[day]);
                }
                
            } else {
                rankings.add(score[day]);
            }

            Collections.sort(rankings);
            
            answer[a++] = rankings.get(0);
        }
        
        return answer;
    }
    
    
}