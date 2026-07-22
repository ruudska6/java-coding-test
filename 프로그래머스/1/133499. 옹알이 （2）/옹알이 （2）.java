class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] canWords = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            int index = 0;
            int previous = -1;
            boolean possible = true;
            
            while (index < word.length()) {               
                boolean found = false;
                
                for (int i = 0; i < canWords.length; i++) {
                    
                    if (previous == i) {
                        continue;
                    }    
                
                    if (word.startsWith(canWords[i], index)) {
                        index += canWords[i].length();
                        previous = i;
                        found = true;
                        break;
                    }
                }
                
                if (!found) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) answer++;
                

        }
        
        return answer;
    }
}