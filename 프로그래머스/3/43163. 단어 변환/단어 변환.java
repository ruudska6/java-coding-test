import java.util.*;

class Solution {    
    static boolean[] visited;
    
    public int bfs(Node begin, String target, String[] words) {
        Queue<Node> q = new LinkedList<>();
        q.offer(begin);
        
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.word.equals(target)) return cur.cnt;
            
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && isConnected(cur.word, words[i])) {
                    q.offer(new Node(words[i], cur.cnt + 1));
                    visited[i] = true;
                }
            }
            
        }
        
        return 0;
    }
    
    public int solution(String begin, String target, String[] words) {

        visited = new boolean[words.length];        
        int answer = bfs(new Node(begin, 0), target, words);
        
        return answer;
    }
    
    static boolean isConnected(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
            }
        }

        if (diff == 1) return true;
        else return false;
    }
    
    
    class Node {
        String word;
        int cnt;
        
        Node (String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }
}