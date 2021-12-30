package days.m09.w01.day04;

import java.util.Arrays;
import java.util.Comparator;

public class ProBIgNum {
    public String solution(int[] numbers) {
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        Comparator<String> comp = (o1, o2) -> (o2 + o1).compareTo(o1 + o2);
        Arrays.sort(result, comp);

        if(result[0].equals("0")) {
            return "0";
        }

        String answer = "";

        for (String a : result) {
            answer += a;
        }
        return answer;
    }

}
