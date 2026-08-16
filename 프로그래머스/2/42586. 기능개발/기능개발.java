import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remain = (100 - progresses[i] + speeds[i] - 1) 
                / speeds[i];
            q.offer(remain);
        }
        
        List<Integer> result = new ArrayList<>();
        int days = 1;
        while (!q.isEmpty()) {
            int finish = 0;
            while (!q.isEmpty() && days >= q.peek()) {
                q.poll();
                finish++;
            }
            
            if (finish > 0) result.add(finish);
            
            days++;    
        }
        
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
    
        return answer;
    }
}