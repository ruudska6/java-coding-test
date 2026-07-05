import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int sum = 0;
        for (int i = 0; i < bridge_length; i++) {
            q.offer(0);
        }
        
        int idx = 0;
        while (idx < truck_weights.length) {
            
            answer++;
            sum -= q.poll();   
            
            if (sum + truck_weights[idx] <= weight) {
                q.offer(truck_weights[idx]);
                sum += truck_weights[idx];
                idx++;
                
            } else {
                q.offer(0);
            }
        }
    
        return answer + bridge_length;
    }
}