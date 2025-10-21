import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        String a = scanner.next();
        String b = scanner.next();

        int[] arr1 = new int[32];
        for (int i = 0; i < a.length(); i++) {
            arr1[a.charAt(i) - 'a']++;
        }

        int[] arr2 = new int[32];
        for (int i = 0; i < b.length(); i++) {
            arr2[b.charAt(i) - 'a']++;
        }

        int sum = 0;
        for (int i = 0; i < 32; i++){
            sum += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println(sum);

    }
}
