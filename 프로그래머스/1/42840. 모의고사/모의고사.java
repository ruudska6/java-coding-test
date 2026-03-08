import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] scores = new int[3];
        
        int[] one = new int[] {1, 2, 3, 4, 5};
        int[] two = new int[] {2, 1, 2, 3, 2, 4, 2 ,5};
        int[] three = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5,5};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) scores[0]++;
            if (answers[i] == two[i % two.length]) scores[1]++;
            if (answers[i] == three[i % three.length]) scores[2]++;
        }
        
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            max = Math.max(max, scores[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) list.add(i+1);
        }
        
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}