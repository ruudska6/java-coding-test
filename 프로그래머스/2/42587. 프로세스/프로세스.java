import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new int[] {i, priorities[i]});
        }
        
        int count = 1;
        while (!q.isEmpty()) {
            int[] first = q.poll();    
            
            boolean flag = true;
            for (int[] qq : q) {
                if (qq[1] > first[1]) {
                    q.offer(first);
                    flag = false;
                    break;
                }
            }
                      
            if (flag) {
                if (first[0] == location) return count;
                if (flag) count++;
            }   

        } 
            

        return answer;
    }
}