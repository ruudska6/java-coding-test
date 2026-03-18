class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        String one = new_id.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        for (char x : one.toCharArray()) {
            if ('a' <= x && x <='z' || x >= '0' && x <= '9' || x == '-' || x == '_' || x == '.') {
                sb.append(x);
            }
        }
        
        String two = sb.toString();
        
        sb = new StringBuilder();
        for (char c : two.toCharArray()) {
            if (c == '.') {
                // 직전이 .이면 skip
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') continue;
            }
            
            sb.append(c);
        }
        
        String three = sb.toString();
        
                
        String four = three;
        
        if (four.length() >= 1) {
           if (four.charAt(0) == '.') {
                four = three.substring(1);
            }
            
            
            if (four.length() >= 1 && four.charAt(four.length() - 1) == '.') {
                four = four.substring(0, four.length() - 1);
            }
        }
        
        String five = four;
        if (four.equals("")) {
            five = "a";
        }
        
        String six = five;
        if (six.length() >= 16) {
            six = five.substring(0, 15);
            if (six.charAt(14) == '.') {
                six = six.substring(0, 14);
            }
        }
        
        String seven = six;
        while (seven.length() < 3) {
            seven += String.valueOf(seven.charAt(seven.length()-1));
        }
        
        answer = seven;
        return answer;
    }
}