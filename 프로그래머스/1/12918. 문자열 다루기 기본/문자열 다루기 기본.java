class Solution {
    public boolean solution(String s) {
        
        int len = s.length();
        boolean isNumbers = true;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                continue;
            } else {
                isNumbers = false;
                break;
            }
        }
        
        return (len == 4 || len == 6) && isNumbers;
    }
}