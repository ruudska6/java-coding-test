import java.util.*;

class Music implements Comparable<Music> {
    int number;
    int play;
    
    Music (int number, int play) {
        this.number = number;
        this.play = play;
    }
    
    @Override
    public int compareTo(Music m) {
        if (this.play != m.play) {
            return m.play - this.play;
        }
        
        return this.number - m.number;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        
        // 장르별 총 재생횟수 저장
        Map<String, Integer> total = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            total.put(genres[i], 
                                total
                                 .getOrDefault(genres[i], 0) 
                                 + plays[i] 
                                );
        }
        
  
        
        List<String> genreList = new ArrayList<>(total.keySet());
        genreList.sort((g1, g2) -> {
            return total.get(g2) - total.get(g1); 
        });
        
        // 장르 내 music
        Map<String, List<Music>> musics = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            Music music = new Music(i, plays[i]);
            
            if (!musics.containsKey(genres[i])) {
                musics.put(genres[i], new ArrayList<>());
            }
            
            musics.get(genres[i]).add(music);
        }
        
 
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < genreList.size(); i++) {
            String genre = genreList.get(i);
            List<Music> playList = new ArrayList<>(musics.get(genre));
            
            // 정렬
            Collections.sort(playList);
            
            //2개 뽑기
            
            int limit = 2;
            
            for (int j = 0; j < Math.min(limit, playList.size()); j++)                 {
                    result.add(playList.get(j).number);
                
                }
        }
    
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}