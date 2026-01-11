class Solution {
    public String solution(String s) {
        String lower = s.toLowerCase();
        StringBuilder sb = new StringBuilder(lower.length());

        boolean start = true; 

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);

            if (c == ' ') {
                sb.append(' ');
                start = true;
            } else {
                if (start && c >= 'a' && c <= 'z') {
                    sb.append((char)(c - ('a' - 'A')));
                } else {
                    sb.append(c);
                }
                start = false;
            }
        }

        return sb.toString();
    }
}
