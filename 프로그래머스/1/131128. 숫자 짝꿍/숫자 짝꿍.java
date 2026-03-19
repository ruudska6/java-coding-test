import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        String answer = "";
        
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        int[] cnt = new int[10];
        
        for (char x : X.toCharArray()) {
            cntX[x -'0']++;
        }
        
        for (char y : Y.toCharArray()) {
            cntY[y -'0']++;
        }
        
        // x,y 에 공통으로 있는 숫자의 갯수
        boolean flag = true;
        
        for (int i = 0; i < 10; i++) {
            cnt[i] = Math.min(cntX[i], cntY[i]);
            if (cnt[i] > 0) flag = false;
        }
        
        if (flag) return "-1";
        
        System.out.println(Arrays.toString(cnt));
        
        
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (cnt[i] != 0) {
                sb.append(i);
                cnt[i]--;
            }
        }
        
        answer = sb.toString();
        
        if (answer.charAt(0) == '0') return "0";
        
        return answer;
    }
}