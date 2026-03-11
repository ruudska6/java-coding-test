import java.util.   *;

class Solution {
    public int solution(int[] topping) {
        
        int count = 0;
        
        
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < topping.length; i++) {
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }
        
        for (int i = 0; i < topping.length; i++) {
            
            set.add(topping[i]);
            
            int x = map.get(topping[i]) - 1;
            
            if (x == 0) map.remove(topping[i]);
            else map.put(topping[i], x);

            if (set.size() == map.size()) {
                count++;
            }
        }
        
        return count;
    }
}