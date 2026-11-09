import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        
        List<Integer> list = new ArrayList<>();
        
        Queue<Integer[]> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            q.offer(new Integer[] {progresses[i], speeds[i]});
        }
        
        int days = 1;
        while (!q.isEmpty()) {         
            int count = 0;
            while (!q.isEmpty() && q.peek()[0] + q.peek()[1] * days >= 100) {
                q.poll();
                count++;
            }        
            days++;
            if (count > 0) list.add(count);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}