import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] s = N.split("-");

        for(int i = 0; i < s.length; i++) {
            String[] ss = s[i].split("\\+");
            int sum = 0;
            for(int j = 0; j < ss.length; j++) {
                sum += Integer.parseInt(ss[j]);
            }
            s[i] = String.valueOf(sum);
        }

        int min = Integer.parseInt(s[0]);
        for(int i = 1; i < s.length; i++) {
            min -= Integer.parseInt(s[i]);
        }

        System.out.println(min);
    }
}
