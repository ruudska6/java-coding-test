import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
    
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
                
        int oneCnt = 0;
        int twoCnt = 0;
        int threeCnt = 0;
        for (int i = 0; i < answers.length; i++) {
            if (one[i % one.length] == answers[i]) oneCnt++;
            if (two[i % two.length] == answers[i]) twoCnt++;
            if (three[i % three.length] == answers[i]) threeCnt++;
        }
        
        int max = Math.max(oneCnt, twoCnt);
        max = Math.max(max, threeCnt);
           
        List<Integer> rank = new ArrayList<>();
        if (oneCnt == max) rank.add(1);
        if (twoCnt == max) rank.add(2);
        if (threeCnt == max) rank.add(3);
        
        int[] answer = new int[rank.size()];

        for (int i = 0; i < rank.size(); i++) {
            answer[i] = rank.get(i);
        }    
    
        return answer;
    }
}