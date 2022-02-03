package programmers.level2;

public class num60057 {
    public int solution(String s) {
        int min = 1001;// s의 최대 길이가 1000임
        if (s.length() == 1) {
            return 1;
        }
        //s의 1/2길이만큼만
        for (int i = 1; i <= s.length() / 2; i++) {
            String pat = s.substring(0, i); // 패턴 문자열
            int count = 1;
            String str = "";
            for (int j = i; j <= s.length() - i; j+=i) {
                if (pat.equals(s.substring(j, j + i))){
                    count++;
                }else {
                    if (count > 1) {
                        str += String.valueOf(count);
                    }
                    str += pat;
                    pat = s.substring(j, j + i);
                    count = 1;
                }
            }
            //s % j 남은거 는 따로 해줘야함
            if (count > 1) {
                str += String.valueOf(count);
            }
            str += pat;
            int rest = s.length() % i;
            min = Math.min(min, str.length() + rest);
        }
        return min;
    }
}
