package programmers.level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num42579 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        //각 장르중에 가장 많이 재생된 장르의 1,2위
        //각 장르별 재생수 1,2위가 필요
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> genre = new ArrayList<>();
        for (String key : map.keySet()) {
            genre.add(key);
        }
        Collections.sort(genre, ((o1, o2) -> map.get(o2) - map.get(o1)));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < genre.size(); i++) {
            String g = genre.get(i);

            int max = 0;
            int fIndex = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    fIndex = j;
                }
            }

            max = 0;
            int sIndex = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j] && j != fIndex) {
                    max = plays[j];
                    sIndex = j;
                }
            }

            list.add(fIndex);
            if (sIndex >= 0) {
                list.add(sIndex);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
