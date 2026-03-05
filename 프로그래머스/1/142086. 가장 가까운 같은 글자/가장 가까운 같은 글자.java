import java.util.*;

class Solution {
    public int[] solution(String s) {

        
        //char 배열을 두고 각 값에 다가 인덱스를 넣어두면 되겠다.
        
        int[] chs = new int['z'-'a' + 1];
        boolean[] visited = new boolean['z'-'a' + 1];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a' - 0;
            if (!visited[ch]) {
                visited[ch] = true;
                chs[ch] = i;
                list.add(-1);
            } else {
                list.add(i - chs[ch]);
                chs[ch] = i;
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        

        return answer;
    }
}