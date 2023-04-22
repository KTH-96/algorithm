package programmers.kakao.bl2023;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int nowDate = dayToInt(today);
        List<Integer> list = new ArrayList<>();
        int i = 1;
        for (String e : privacies) {
            String[] split = e.split(" ");
            String pastDate = split[0];
            String privacy = split[1];
            int privacyMon = 0;

            for (String term : terms) {
                if (term.startsWith(privacy)) {
                    privacyMon = Integer.parseInt(term.split(" ")[1]) * 28;
                }
            }

            int deadLine = dayToInt(pastDate) + privacyMon;

            if (nowDate >= deadLine) {
                list.add(i);
            }
            i++;
        }
        int[] answer = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }
        return answer;
    }

    public int dayToInt(String date) {
        String[] day = date.split("\\.");

        return Integer.parseInt(day[0]) * 12 * 28 +
                Integer.parseInt(day[1]) * 28 +
                Integer.parseInt(day[2]);
    }
}
