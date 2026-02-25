import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            q.offer(s.charAt(i));
        }
        
        for (int move = 0; move < s.length(); move++) {
            char k = q.poll();
            q.offer(k);
            if (isRight(q)) answer++;    
        }
        
        return answer;
    }
    
    public static boolean isRight(Queue<Character> qq) {
        Queue<Character> q = new LinkedList<>(qq);
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        while (!q.isEmpty()) {
            char ch = q.poll();
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ']') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }
                    
                    else return false;
                }
                
                else return false;
                
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                    
                    else return false;
                }
                
                else return false;
                
            } else if (ch == '}') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                    
                    else return false;
                }
                
                else return false;
            }
        }        
        
        return stack.isEmpty();
    }
}