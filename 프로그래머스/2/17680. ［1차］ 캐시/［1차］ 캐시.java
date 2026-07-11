class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        String[] cache = new String[cacheSize];

        for (int j = 0; j < cities.length; j++) {
            String find = cities[j].toLowerCase();

            boolean isHit = false;
            int hitIdx = -1;

            for (int idx = 0; idx < cacheSize; idx++) {
                if (find.equals(cache[idx])) {
                    isHit = true;
                    hitIdx = idx;
                    break;
                }
            }

            if (isHit) {
                for (int i = hitIdx; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }

                cache[0] = find;
                answer++;
            } else {
                for (int i = cacheSize - 1; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }

                cache[0] = find;
                answer += 5;
            }
        }

        return answer;
    }
}