import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        // 단어를 저장할 Set
        Set<String> set = new HashSet<>();
        
        // 몇번 참가자가 탈락했는지 저장
        int turn = 2;
        int round = 2;
        char last = words[0].charAt(words[0].length() - 1);
        set.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {           
            // 첫 단어가 last와 같은지 확인
            char first = words[i].charAt(0);
                        
            if (first != last) {
                return new int[] {turn, (round + n - 1) / n};
            }
            
            last = words[i].charAt(words[i].length() - 1);

            // 중복인지 확인
            if (set.contains(words[i])) {
                return new int[] {turn, (round + n - 1) / n};
            }
            
            // 단어 저장
            set.add(words[i]);
            
            turn = (turn % n) + 1;
            round++;

            System.out.println(words[i]);
        }
        
        return new int[] {0, 0};
    }
}