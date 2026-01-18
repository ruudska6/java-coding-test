class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }
        
        int p1 = 0;
        int p2 = 0;
        int sum = arr[0];
        
        while(p2 < n) {
            if (sum < n) {
                p2++;
                if (p2 == n) break;
                sum += arr[p2];    
                
            } else if (sum == n) {
                answer++;
                sum -= arr[p1];
                p1++;
            } else {
                sum -= arr[p1];
                p1++;
            }
        }
    
        return answer;
    }
}