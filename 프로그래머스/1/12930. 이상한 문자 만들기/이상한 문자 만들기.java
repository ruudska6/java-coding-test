class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                index = 0;
                continue;
            }
            
            if (index % 2 == 0) {
                arr[i] = Character.toUpperCase(arr[i]); 
                index++;
            } else {
                arr[i] = Character.toLowerCase(arr[i]); 
                index++;
            }
        }
        
        answer = new String(arr);
        return answer;
    }
}