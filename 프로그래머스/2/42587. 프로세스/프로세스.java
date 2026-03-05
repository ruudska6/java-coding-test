import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        ArrayDeque<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new int[] {i, priorities[i]});
        }
        
        int count = 1;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            
            if (!isHigh(q, now)) {
                q.offer(now);
            } else {
                if (now[0] == location) {
                    answer = count;
                    break;
                }      
                
                count++;
            }
            
          
 
        }
                            
        return answer;
    }
    
    private static boolean isHigh(ArrayDeque<int[]> q, int[] now) {
       
        for (int[] x : q) {
            if (now[1] < x[1]) return false;
        }
        
        return true;
    }
}