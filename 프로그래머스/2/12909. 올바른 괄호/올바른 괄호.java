import java.util.*;

class Solution {
    boolean solution(String s) {
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);    
            } else if (c == ')') {
                if (stack.isEmpty()) return false;
                if (stack.peek() == '(') {
                    stack.pop();
                }
            }
        }
        
        System.out.println("hi");
        if (stack.isEmpty()) return true;
        else return false;
    }
}