import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int s : scoville) {
            minHeap.add(s);
        }
        
        int cnt = 0;
        while (minHeap.peek() < K) {
            
            if (minHeap.size() < 2) return -1; 
            
            int firstMin = minHeap.poll();
            int SecondMin = minHeap.poll();
            int mixed = firstMin + (SecondMin * 2);
            
            minHeap.add(mixed);
            cnt++;
        }
        
        return cnt;
    }
}