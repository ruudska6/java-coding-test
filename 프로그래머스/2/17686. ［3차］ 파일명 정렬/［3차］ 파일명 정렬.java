import java.util.*;

class File {
    
    String head;
    String number;
    String tail;
    
    File(String head, String number, String tail) {
        this.head = head;
        this.number = number;
        this.tail = tail;
    }
}


class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        
        File[] fs = new File[files.length];
        for (int i = 0; i < files.length; i++) {
            
            int start = 0;
            for (int j = 0; j < files[i].length(); j++) {
               
                if (files[i].charAt(j) -'0' >= 0  && files[i].charAt(j) -'0' <= 9) {
                    break;
                }
                
                 start++;
            }
            
            String head = files[i].substring(0, start);
            
            int mid = start;
            boolean find = false;
            for (int j = start; j < files[i].length(); j++) {
              
                if (!Character.isDigit(files[i].charAt(j))) {
                    find = true;
                    break;
                }
                
                 mid++;
            }
            
            String number = files[i].substring(start, mid);
                
            String tail = "";
            if (find) {
                tail = files[i].substring(mid);
            } 
            
            System.out.println(head);
            System.out.println(number);
            System.out.println(tail);
            
            // 잘 끊어서
            fs[i] = new File(head, number, tail);
        
        }
        
        Arrays.sort(fs, (a, b) -> {
        if (a.head.toLowerCase().compareTo(b.head.toLowerCase()) != 0) {
            return a.head.toLowerCase().compareTo(b.head.toLowerCase());
        } 
            

        // 문자 number -> 숫자 number로 바꿔야겠다.
        if (Integer.compare(Integer.parseInt(a.number), Integer.parseInt(b.number)) != 0) {
            return Integer.compare(Integer.parseInt(a.number), Integer.parseInt(b.number));
        }
        
            
        // 그대로
        return 0;
    
        });
        
        for (int i = 0; i < fs.length; i++) {
            answer[i] = fs[i].head + fs[i].number + fs[i].tail;
        }
        
        return answer;
    }
}