import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] sNums = new String[numbers.length]; 
        for (int i = 0; i < numbers.length; i++) {
            sNums[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(sNums, (a, b) -> {
            String c = a + b;
            String d = b + a;
            
            return Integer.compare(Integer.parseInt(d), Integer.parseInt(c));
        });
        
        for (String s : sNums) {
            answer += s;
        }
        
        if (sNums[0].equals("0")) return "0";
        
        return answer;
    }
}