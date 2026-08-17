import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[] > q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            // 프로세스 이름, 중요도
            int[] p = {i, priorities[i]};
            q.offer(p);
        }
        
        int cnt = 1;
        while (cnt <= priorities.length) {
            int[] cur = q.poll();

            int max = -1;
            for (int i = 0; i < q.size(); i++) {
                int[] next = q.poll();
                q.offer(next);
                max = Math.max(next[1], max);
            }
                        
            if (cur[1] < max) {
                q.offer(cur);
                continue;
            }
            
            if (cur[0] == location) return cnt;
            cnt++;
        
        }
        
        return answer;
    }
}