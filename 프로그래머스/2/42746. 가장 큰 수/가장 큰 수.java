import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        Integer[] arr = new Integer[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = numbers[i];
        }
        
        Arrays.sort(arr, (o1, o2) -> {
            String ab = String.valueOf(o1) + String.valueOf(o2);
            String ba = String.valueOf(o2) + String.valueOf(o1);
            return ba.compareTo(ab);
        });
        
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        
        answer = sb.toString();
        if (answer.charAt(0) == '0') return "0";
        return answer;
    }
}