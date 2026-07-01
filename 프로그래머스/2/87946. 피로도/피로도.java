class Solution {
    
    static int max = Integer.MIN_VALUE;
    static boolean[] visited;
    
    private static void dfs(int depth, int hp, int[][]dungeons) { 
        
        max = Math.max(max, depth);
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= hp) {
                visited[i] = true;
                dfs(depth + 1, hp - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
    
        return max == Integer.MIN_VALUE ? answer : max;    
    }
}