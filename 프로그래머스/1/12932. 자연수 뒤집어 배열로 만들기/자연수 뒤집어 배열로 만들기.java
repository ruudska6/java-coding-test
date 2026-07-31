class Solution {
    public int[] solution(long n) {

        
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n));
        sb.reverse();
        
        String s = sb.toString();
        System.out.println(s);
        
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(i) -'0';
        }
        
        return answer;
    }
}