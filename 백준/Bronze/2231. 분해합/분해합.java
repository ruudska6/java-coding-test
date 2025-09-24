import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i=0; i < N; i++) {
            int sum = i; //245
            int temp = i;
            while (temp > 0) {
                sum = sum + temp % 10; // 5
                temp = temp / 10; // 24
            }
            if (sum == N) { // 256
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);

    }
}
