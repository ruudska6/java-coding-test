import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++) {
            int n = (int)(Math.ceil((double)(100 - progresses[i]) / speeds[i]));
            q.offer(n);
        }
        
        int days = 0;
        List<Integer> dayList = new ArrayList<>();
        while (!q.isEmpty()) {
            days++;
            int cnt = 0;
            while (!q.isEmpty() && days >= q.peek()) {
                q.poll();
                cnt++;
            }
            
            if (cnt != 0) dayList.add(cnt);
        }
        
        int[] answer = new int[dayList.size()];
        for (int i = 0; i < dayList.size(); i++) {
            answer[i] = dayList.get(i);
        }
        
        return answer;
    }
}