import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> inputCars = new LinkedHashMap<>();

        for (int start = 1; start <= n; start++) {
            String car = br.readLine();
            inputCars.put(car, start);
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            String outputCar = br.readLine();

            for (String car : inputCars.keySet()) {
                if (car.equals(outputCar)) break;

                count++;
                break;
            }

            inputCars.remove(outputCar);
        }

        System.out.println(count);
    }
}
