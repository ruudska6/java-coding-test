import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int p1 = 1;
        int p2 = 1;
        int sum = 1;
        int cnt = 1;
        while (p2 != N) {
            if (sum < N) {
                p2++;
                sum += p2;
            } else if (sum > N) {
                sum -= p1;
                p1++;
            } else {
                cnt++;
                p2++;
                sum += p2;
            }
        }

        System.out.println(cnt);
    }
}
