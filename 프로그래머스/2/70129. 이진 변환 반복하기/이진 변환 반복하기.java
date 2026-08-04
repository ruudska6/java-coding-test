import java.util.*;

class Solution {
    public int[] solution(String s) {

       
        int cnt = 0;
        int zeroCnt = 0;
        while (!s.equals("1")) {
            int len = s.length();
            // s의 모든 0을 제거합니다.
            s = s.replace("0", "");
            // 0이 제거된 x의 길이
            int c = s.length();
            
            // 제거된 0의 개수
            zeroCnt += len - c;
            
            // c를 2진수 변환
            s = Integer.toString(c, 2);
            
            cnt++;
        }
        
        int[] answer = {cnt, zeroCnt};
        return answer;
    }
}