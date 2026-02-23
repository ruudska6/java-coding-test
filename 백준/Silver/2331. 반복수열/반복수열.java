import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] visited;
    static int P;
    static int count;

    static void dfs(int k, int order) {
        if (visited[k] != -1) {
            System.out.println(visited[k] - 1);
            return;
        } else {
            visited[k] = order;

            String sNum = String.valueOf(k);
            int sum = 0;
            for (int i = 0; i < sNum.length(); i++) {
                sum += Math.pow(sNum.charAt(i) - '0', P);
            }

            dfs(sum, order+1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        P = scanner.nextInt();

        visited = new int[300000];
        Arrays.fill(visited, -1);

        dfs(A, 1);
    }
}
