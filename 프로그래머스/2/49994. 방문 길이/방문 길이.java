import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        Set<String> set = new HashSet<>();
        int[] now = {5, 5};

        for (int i = 0; i < dirs.length(); i++) {
            int x = now[0];
            int y = now[1];
            int nx = now[0];
            int ny = now[1];

            if (dirs.charAt(i) == 'U') {
                if (now[0] < 10) {
                    nx = now[0] + 1;
                    ny = now[1];
                }
            } else if (dirs.charAt(i) == 'D') {
                if (now[0] > 0) {
                    nx = now[0] - 1;
                    ny = now[1];
                }
            } else if (dirs.charAt(i) == 'R') {
                if (now[1] < 10) {
                    nx = now[0];
                    ny = now[1] + 1;
                }
            } else if (dirs.charAt(i) == 'L') {
                if (now[1] > 0) {
                    nx = now[0];
                    ny = now[1] - 1;
                }
            }

            if (x == nx && y == ny) continue;

            String path1 = x + "," + y + "," + nx + "," + ny;
            String path2 = nx + "," + ny + "," + x + "," + y;

            if (!set.contains(path1)) {
                set.add(path1);
                set.add(path2);
                answer++;
            }

            now[0] = nx;
            now[1] = ny;
        }

        return answer;
    }
}