import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int aCnt, cCnt, gCnt, tCnt;
    static int[] checked;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        char[] password = scanner.nextLine().toCharArray();
        checked = new int[4];
        for (int i = 0; i < M; i++) {
            checkChar(password[i]);
        }

        aCnt = scanner.nextInt();
        cCnt = scanner.nextInt();
        gCnt = scanner.nextInt();
        tCnt = scanner.nextInt();
        int cnt = 0;

        if (checked[0] >= aCnt && checked[1] >= cCnt && checked[2] >= gCnt && checked[3] >= tCnt) {
            cnt++;
        }

        for (int i = M; i < N; i++) {
            uncheckChar(password[i-M]);
            checkChar(password[i]);

            if (checked[0] >= aCnt && checked[1] >= cCnt && checked[2] >= gCnt && checked[3] >= tCnt) {
                cnt++;
            }

        }

        System.out.println(cnt);
    }

    static void checkChar(char c) {
        if (c == 'A') {
            checked[0]++;
        } else if (c == 'C') {
            checked[1]++;
        } else if (c == 'G') {
            checked[2]++;
        } else if (c == 'T') {
            checked[3]++;
        }
    }

    static void uncheckChar(char c) {
        if (c == 'A') {
            checked[0]--;
        } else if (c == 'C') {
            checked[1]--;
        } else if (c == 'G') {
            checked[2]--;
        } else if (c == 'T') {
            checked[3]--;
        }
    }
}
