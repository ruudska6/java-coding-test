import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        s = s.substring(2, s.length() - 2);
        String[] list = s.split("\\},\\{");
        
        // s 길이 기준 sort
        Arrays.sort(list, (o1, o2) -> {
            return o1.length() - o2.length(); 
        });
        
        // list에서 제일 큰 길이를 가진 String의 길이
        int[] answer = new int[list.length];
        
        // 중복인지 체크 용 SET        
        Set<Integer> set = new HashSet<>();

        // 원소가 집합에 없다면 추가
        for (int i = 0; i < list.length; i++) {
            String[] sNum = list[i].split(",");
            for (int j = 0; j < sNum.length; j++) {
                if (!set.contains(Integer.parseInt(sNum[j]))) {
                    answer[i] = Integer.parseInt(sNum[j]);
                    set.add(Integer.parseInt(sNum[j]));
                } else {
                    continue;
                }
            } 
        }
        
        return answer;
    }
}