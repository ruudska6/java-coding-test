import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        // map을 key값을 기준으로 내림차순
        List<Integer> counts = new ArrayList<>(map.values());
        counts.sort(Collections.reverseOrder());
        
        // 바구니에 갯수가 가장 많은 크기를 다넣고 => 이어서 다넣고 해서 k만큼을 채워야함
        
        int count = 0;
        for (int i = 0; i < counts.size(); i++) {
            
            count += counts.get(i);
            
            answer++;
            
            if (count >= k) {
                break;
            }
        }
    
        return answer;
    }
}