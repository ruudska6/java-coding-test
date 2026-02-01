import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long result = gcd(a,b);

        while (result > 0) {
            sb.append("1");
            result--;
        }
        
        System.out.println(sb);
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        else  return gcd(b, a % b);
    }
}
