import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);


        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int find = arr[i];
            int p1 = 0;
            int p2 = n - 1;

            while (p1 < p2) {
                if (arr[p1] + arr[p2] == find) {
                    if (p1 != i && p2 != i) {
                        cnt++;
                        break;
                    } else if (p1 == i) {
                        p1++;
                    } else if (p2 == i) {
                        p2--;
                    }
                } else if (arr[p1] + arr[p2] > find) {
                    p2--;
                } else if (arr[p1] + arr[p2] < find) {
                    p1++;
                }
            }
        }
        
        System.out.println(cnt);
    }
}
