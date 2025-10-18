import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,Integer> dictionary = new HashMap<String,Integer>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                dictionary.put(word, dictionary.getOrDefault(word,0)+1);
            }
        }

        List<String> keySet = new ArrayList<>(dictionary.keySet());

        keySet.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                if (dictionary.get(o1) != dictionary.get(o2)) {
                    return dictionary.get(o2) - dictionary.get(o1);
                }

                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }

                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (String key : keySet) {
            sb.append(key).append("\n");
        }

        System.out.println(sb);

    }
}
