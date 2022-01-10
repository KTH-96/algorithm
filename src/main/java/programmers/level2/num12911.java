package programmers.level2;

public class num12911 {
    public int solution(int n) {
        String s = Integer.toBinaryString(n);
        int nCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                nCount++;
            }
        }
        for (int i = n + 1; i < 10000001; i++) {
            String s2 = Integer.toBinaryString(i);
            int nextCount = 0;
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == '1') {
                    nextCount++;
                }
            }
            if (nextCount == nCount) {
                return i;
            }
        }
        return -1;
    }
}
