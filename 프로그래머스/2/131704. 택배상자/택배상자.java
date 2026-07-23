import java.util.*;

class Solution {
    public int solution(int[] order) {
        
        ArrayDeque<Integer> truck = new ArrayDeque<>();
        ArrayDeque<Integer> container = new ArrayDeque<>();
        
        int index = 0;
        int box = 1;
        while (index < order.length) {
            
            if (box == order[index]) {
                truck.offer(box);
                box++;
                index++;
            } else {
                if (!container.isEmpty() &&
                    container.peek() == order[index]) {
                    truck.offer(container.pop());
                    index++;
                } else if (!container.isEmpty() &&
                    order[index] < box) {
                    return truck.size();
                } else {
                    container.push(box);
                    box++;
                }
            }
        }
                    
        return truck.size();
    }
}