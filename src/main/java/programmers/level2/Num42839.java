package programmers.level2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Num42839 {
    static Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        tracking("", numbers);
        int answer = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (isPrime(number)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isPrime(Integer number) {
        if (number == 0 || number == 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void tracking(String comb, String numbers) {
        if (!comb.equals("")) {
            set.add(Integer.valueOf(comb));
        }

        for (int i = 0; i < numbers.length(); i++) {
            tracking(comb + numbers.charAt(i),
                    numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }
}
