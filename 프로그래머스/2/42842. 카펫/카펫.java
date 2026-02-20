class Solution {
    public int[] solution(int brown, int yellow) {
  
        int area = brown + yellow;
        
        int row = 0;
        int col = 0;
        for (int i = 1; i <= Math.sqrt(area); i++) {
            if (area % i == 0) {
                col = area / i;
                if ((i - 2) * (col - 2) == yellow) {
                    row = i;
                    if (row < col) {
                        int temp = col;
                        col = row;
                        row = temp;
                    }
                    break;
                }
            }
        }
        
        int[] answer = {row, col};  
        return answer;
    }
}