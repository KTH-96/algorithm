package programmers.level1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class num12933 {
    public long solution(long n) {
        List<Long> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 10);
            n /= 10;
        }
        Collections.sort(list, Collections.reverseOrder());
        String answer = "";
        for (Long aLong : list) {
            answer += String.valueOf(aLong);
        }
        return Long.valueOf(answer);
    }
}
