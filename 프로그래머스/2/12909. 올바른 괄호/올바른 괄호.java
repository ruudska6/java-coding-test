import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(')');
                    }
                }
            }     
        }
        
        if (!stack.isEmpty()) return false;
        
        return answer;
    }
}