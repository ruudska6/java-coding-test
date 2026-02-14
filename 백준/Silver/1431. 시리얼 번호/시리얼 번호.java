import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    static class Serials {
        String serial;

        public Serials(String serial) {
            this.serial = serial;
        }

        public static int sumOnlyNumbers(String serial) {
            int sum = 0;
            for (int i = 0; i < serial.length(); i++) {
                if (serial.charAt(i) -'0' >= 0 && serial.charAt(i) -'0' <= 9) {
                    sum += serial.charAt(i) -'0';
                }
            }

            return sum;
        }
    }

    static class SerialComparator implements Comparator<Serials> {

        @Override
        public int compare(Serials o1, Serials o2) {
            
            // 글자수가 다르다면
            if (o1.serial.length() != o2.serial.length()) {
                return o1.serial.length() - o2.serial.length();
            }
            
            // 글자수가 같고, sum이 다르면
            int sum1 = Serials.sumOnlyNumbers(o1.serial);
            int sum2 = Serials.sumOnlyNumbers(o2.serial);

            if (sum1 != sum2) {
                return sum1 - sum2;
            }
            
            // 글자수도 같고, sum도 같으면
            return o1.serial.compareTo(o2.serial);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Serials[] arr = new Serials[n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr[i] = new Serials(s);
        }

        Arrays.sort(arr, new SerialComparator());

        for (Serials s : arr) {
            System.out.println(s.serial);
        }
    }
}
