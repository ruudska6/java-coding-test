import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int i2 = 0; i2 < targets[i].length(); i2++) {
                char target = targets[i].charAt(i2);
                int minCnt = 101;
    
                for (int j = 0; j < keymap.length; j++) {
 
                    int cnt = 0;
                    for (int k = 0; k < keymap[j].length(); k++) {
                        cnt++;
                        if (keymap[j].charAt(k) == target) {
                            minCnt = Math.min(minCnt, cnt);
                            break;
                        }
                    }
            
                }
                
                if (minCnt == 101) {
                    sum = -1;
                    break;
                } 
                    
                sum += minCnt;
            }
                        
            list.add(sum);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
    
        return answer;
    }
}