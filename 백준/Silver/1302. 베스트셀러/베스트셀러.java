import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
           String s = sc.next();
           map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // 순회하면서 map에 있는 value가 가장 큰걸 찾음(maxValue)
        int maxValue = -1;
        String maxKey = null;
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
                // maxValue랑 동일한 value값을 찾았다면 key값으로 비교(사전 순으로 앞선것 찾기)
            } else if (value == maxValue) {
                if (key.compareTo(maxKey) <= 0) {
                    maxKey = key;
                }
            }
        }

        System.out.println(maxKey);
    }
}
