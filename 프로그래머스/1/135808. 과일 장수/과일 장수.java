import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        // score 정렬
        Arrays.sort(score);
    
        // 높은 점수부터 박스에 담음
        int sum = 0;
        for (int i = score.length - m; i >= 0; i -= m) {
            sum += score[i] * m;
        }
    
        return sum;
    }
}