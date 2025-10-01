import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] suffixes = new String[str.length()];

        for (int i = suffixes.length - 1; i >= 0; i--) {
            suffixes[i] = str.substring(i);
        }

        Arrays.sort(suffixes);

        for (int i = 0; i < suffixes.length; i++) {
            System.out.println(suffixes[i]);
        }

    }
}
