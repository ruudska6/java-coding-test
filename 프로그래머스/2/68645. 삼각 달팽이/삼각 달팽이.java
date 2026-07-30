class Solution {
    public int[] solution(int n) {

        
        int[][] triangle = new int[n][n];
        int v = 1;
        int x = 0;
        int y = 0;
        
        while (true) {
                        
            // 아래로
            while (true) {
                triangle[y][x] = v++;
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y++;
            }
            if (x + 1 == n || triangle[y][x + 1] != 0) break;
            x++;
            
            // 오른쪽으로
            while (true) {
                triangle[y][x] = v++;
                if (x + 1 == n || triangle[y][x+1] != 0) break;
                x++;
            }
            
            if (y - 1 < 0 || x - 1 < 0 || triangle[y-1][x-1] != 0) break;
            y--;
            x--;
            
            // 왼쪽 위로
            while (true) {
                triangle[y][x] = v++;
                if (x - 1 == n || triangle[y-1][x-1] != 0) break;
                y--; 
                x--;
            }
            
            if (y + 1 == n || triangle[y + 1][x] != 0) break;
            y++;
            
        }
        
        int[] answer = new int[v-1];
        int index = 0;
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = triangle[i][j];
            }
        }
        
        return answer;
    }
}