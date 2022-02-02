package programmers.level2;

public class num60057 {
    public int solution(String s) {
        int min = 1001;
        if (s.length() == 1 ) return 1;
        for (int i = 1; i <= s.length() / 2; i++) {
            int count = 0;
            String temp = s.substring(0, i);
            String number = "";
            for (int j = i; j < s.length(); j+=i) {
                if (temp.equals(s.substring(j, j + i))) {
                    count++;
                } else {
                        if (count > 1) {
                            number += String.valueOf(count);
                        }
                        number += temp;
                        count = 1;
                }
            }
            if (count > 1) {
                number += String.valueOf(count);
            }
            number += temp;
            int rest = s.length() % i;
            min = Math.min(min, number.length() + rest);
        }

        return min;
    }
}
