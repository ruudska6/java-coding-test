import java.util.Scanner;

public class Main {
    static int cnt = 0;
    static int recursion(char[] chs, int l, int r) {
        cnt++;
        int cnt = 0;
        if(l >= r) return 1;
        else if(chs[l] != chs[r]) return 0;
        else return recursion(chs, l+1, r-1);
    }

    static int isPalindrome(char[] chs){
        return recursion(chs, 0, chs.length-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            cnt = 0;
            char[] chs = scanner.next().toCharArray();
            System.out.println(isPalindrome(chs) + " " + cnt);
        }
    }
}
