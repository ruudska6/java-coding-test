import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            minHeap.offer(scoville[i]);
        }
        
        while(minHeap.size() >= 2 && minHeap.peek() < K) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            
            int fs = first + (second * 2);
            
            minHeap.offer(fs);
            answer++;
        }
        
        if (minHeap.peek() < K) return -1;
        
        return answer;
    }
}