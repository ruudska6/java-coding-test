import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : array) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int maxCnt = 0;
        for (int x : map.keySet()) {
            maxCnt = Math.max(map.get(x), maxCnt);
        }
        
        int cnt = 0;
        int num = 0;
        for (int x : map.keySet()) {
            if (map.get(x) == maxCnt) {
                num = x;
                cnt++;
            }
        }
        
        if (cnt > 1) {
            return -1;
        } else {
            return num;
        }
    }
}