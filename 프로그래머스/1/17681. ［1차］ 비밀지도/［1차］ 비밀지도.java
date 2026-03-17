class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        // arr(10진) -> 5비트짜리 2진수로 변경

        
        int[][] map = new int[n][n];
    
        for (int i = 0; i < n; i++) {   
        String binary1 = String.format("%" + n + "s",
           Integer.toBinaryString(arr1[i]))
            .replace(" ", "0");
            
        String binary2 = String.format("%" + n + "s",
           Integer.toBinaryString(arr2[i]))
            .replace(" ", "0");


            for(int j = 0; j < n; j++) {
                if (binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                        map[i][j] = 1;
                    } 
            }
    
        }
        
    
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
               if (map[i][j] == 1) {
                   s += "#";
               } else if (map[i][j] == 0) {
                   s += " ";
               }
            }
            
            answer[i] = s;
        }

        return answer;
    }
}