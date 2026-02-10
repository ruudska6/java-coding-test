import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static class CoordinateCompartor implements Comparator<Coordinate> {

        @Override
        public int compare(Coordinate o1, Coordinate o2) {
            if (o1.y == o2.y) {
                return o1.x - o2.x;
            } else {
                return o1.y - o2.y;
            }
        }
    }

    static class Coordinate {
        int x;
        int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Coordinate[] coordinates = new Coordinate[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Coordinate coor = new Coordinate(x, y);
            coordinates[i] = coor;
        }

        Arrays.sort(coordinates, new CoordinateCompartor());

        for (int i = 0; i < coordinates.length; i++) {
            System.out.println(coordinates[i].x + " " + coordinates[i].y);
        }
    }
}
