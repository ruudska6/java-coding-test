class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
            
        for (int w = 1; w <= brown + yellow; w++) {
            for (int h = 1; h <= brown + yellow; h++) {
                if ((w - 2) * (h - 2) == yellow) {
                    if (w * h == brown + yellow) {
                        if (w > h) {
                            return new int[] {w, h};      
                        } else {
                            return new int[] {h, w};
                        }

                    }
      
                }
            }
        }
        
        return answer;
    }
}