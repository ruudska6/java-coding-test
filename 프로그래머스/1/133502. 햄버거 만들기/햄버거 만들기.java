import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for (int x : ingredient) {
            
            list.add(x);
            
            int size = list.size();
            
            if (size >= 4) {
                if (list.get(size - 1) == 1) {
                    if (list.get(size - 2) == 3) {
                        if (list.get(size - 3) == 2) {
                            if (list.get(size - 4) == 1) {
                                answer++;
                                list.remove(size - 1);
                                list.remove(size - 2);
                                list.remove(size - 3);
                                list.remove(size - 4);
                            }
                        }
                    }
                }
            }
            
            

        }
        
        return answer;
    }
}