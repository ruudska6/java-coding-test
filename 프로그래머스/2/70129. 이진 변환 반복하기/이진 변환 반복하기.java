class Solution {

    
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            String binaryRemovedZero = s.replace("0", "");
            answer[1] += s.length() - binaryRemovedZero.length();
            int c = binaryRemovedZero.length();
            s = Integer.toBinaryString(c);
            answer[0]++;
        }
        
        return answer;
     
    }
}