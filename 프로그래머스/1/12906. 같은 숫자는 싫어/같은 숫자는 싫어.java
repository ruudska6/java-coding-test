import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
 
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int now = arr[i];
            if (!stack.isEmpty() && stack.peek() != now) {
                stack.push(now);
            }
        }
        
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}