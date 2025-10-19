import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int p1 = 0, p2 = 0;
        int sum = 0;
        int cnt = 0;

        while (true) {
            if (sum >= M) sum -= arr[p1++];
            else if (p2 == N) break;
            else sum += arr[p2++];

            if (sum == M) cnt++;
        }

        System.out.println(cnt);
    }
}
