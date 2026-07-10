import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        
        reverse(B);
        Arrays.sort(B);
        reverse(B);
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
    
    private static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * -1;
        }
        
        return arr;
    } 
}