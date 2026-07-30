import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        
        List<Point> points = new ArrayList<>();
        
        for (int i = 0; i < line.length; i++) {
                long A = line[i][0];
                long B = line[i][1];
                long E = line[i][2];
            for (int j = i + 1; j < line.length; j++) {
                long C = line[j][0];
                long D = line[j][1];
                long F = line[j][2];
                
                long denom = A * D - B * C;
                if (denom == 0) continue;
                
                if ((B*F - E*D) % denom != 0 || (E*C - A*F) % denom != 0) {
                    continue;
                }
                
                // 교점 구하기
                long x = (B*F - E*D) / denom;
                long y = (E*C - A*F) / denom;
            
                points.add(new Point(x, y));                           
            }
        }
        
        Point minPoint = getMinPoint(points);
        Point maxPoint = getMaxPoint(points);
        
        int width = (int) (maxPoint.x - minPoint.x + 1);
        int height = (int) (maxPoint.y - minPoint.y + 1);
        
        char[][] arr = new char[height][width];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '.';
            }
        }
        
        for (Point p : points) {
            int x = (int) (p.x - minPoint.x);
            int y = (int) (maxPoint.y - p.y);
            arr[y][x] = '*';
        }
        
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        
        return result;
    }
    
    static class Point {
        long x, y;
        
        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
        
    }
    
    private static Point getMinPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }
        
        return new Point(x, y);
    }
    
    private static Point getMaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        
        return new Point(x, y);
    }
}