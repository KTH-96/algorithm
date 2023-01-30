package programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Num12981 {
    public static void main(String[] args) {
        Num12981 a = new Num12981();
        System.out.println(Arrays.toString(a.solution(2,
                new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }
    public int[] solution(int n, String[] words) {
        //n 사람수 words 단어
        Set<String> set = new HashSet<>();
        int wrongNum = 0;
        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i])) {
                wrongNum = i;
                break;
            }
            if (i == words.length - 1) {
                break;
            }
            set.add(words[i]);
            if (!words[i].substring(words[i].length() - 1)
                    .equals(words[i + 1].substring(0, 1))) {
                wrongNum = i + 1;
                break;
            }
        }
        if (wrongNum == 0) {
            return new int[]{0, 0};
        }
        int person = 1;
        if (wrongNum % n != 0) {
            person = wrongNum % n + 1;
        }
        int time = wrongNum / n + 1;

        return new int[]{person, time};
    }
}
