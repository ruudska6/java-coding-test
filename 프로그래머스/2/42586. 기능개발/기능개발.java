import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        List<Integer> list = new ArrayList<>();
        
        int done = 0;
        while (done < n) {
            
            for (int i = 0; i < n; i++) {
                progresses[i] += speeds[i];
            }
            
            int count = 0; 
            while (done < n && progresses[done] >= 100) {
                done++;
                count++;
            }
            
            if (count != 0) list.add(count);
            
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}