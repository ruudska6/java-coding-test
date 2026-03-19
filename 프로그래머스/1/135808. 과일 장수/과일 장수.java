import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        // score 내림차순 정렬
        score = change(score);
        Arrays.sort(score);
        score = change(score);
    
        // 높은 점수부터 박스에 담음
        int sum = 0;
        for (int i = m - 1; i < score.length; i += m) {
            sum += score[i] * m;
        }
    
        return sum;
    }
    
    public static int[] change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * -1;
        }
        
        return arr;
    }
}