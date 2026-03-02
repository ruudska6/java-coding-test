class Solution {
    static String[] list = {"A", "E", "I", "O", "U"};
    static int count;
    static boolean flag;
    public int solution(String word) {
    
        
        dfs(word, "");
        
        return count;
    }
    
    private static void dfs(String word, String k) {
        if (flag) return;
        
        if (!k.isEmpty()) {
            count++;
            if (word.equals(k)) {
                flag = true;
                return;
            }
        }
        
        if (k.length() == 5) return;

        for (int i = 0; i < list.length; i++) {
            dfs(word, k + list[i]);
        }
    }
}