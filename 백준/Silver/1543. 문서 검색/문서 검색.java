import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String find = scanner.nextLine();

        s = s.replaceAll(find, "@");

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') cnt++;
        }
        System.out.println(cnt);
    }
}
