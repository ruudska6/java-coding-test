import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new  StringTokenizer(br.readLine(), " ");

        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());

        int[] a = new int[aSize];
        int[] b = new int[bSize];
        int[] c =  new int[aSize + bSize];

        st = new  StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < aSize; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new  StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < bSize; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < aSize; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < bSize; i++) {
            c[aSize + i] = b[i];
        }

        Arrays.sort(c);

        StringBuilder sb = new StringBuilder();
        for (int i : c) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
