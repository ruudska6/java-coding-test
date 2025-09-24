import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarfs = new int[9];

        int sum = 0;
        for (int i = 0; i < dwarfs.length; i++) {
            int dwarf = Integer.parseInt(br.readLine());
            dwarfs[i] = dwarf;
            sum += dwarf;
        }

        int mafiaA = 0;
        int mafiaB = 0;
        for (int i = 0; i < dwarfs.length; i++) {
            for (int j = i + 1; j < dwarfs.length; j++) {
                if (sum - (dwarfs[i] + dwarfs[j]) == 100) {
                    mafiaA = dwarfs[i];
                    mafiaB =  dwarfs[j];
                    break;
                }
            }
        }

        Arrays.sort(dwarfs);

        for (int i = 0; i < dwarfs.length; i++) {
            if(dwarfs[i] != mafiaA && dwarfs[i] != mafiaB) {
                System.out.println(dwarfs[i]);
            }
        }
    }
}
