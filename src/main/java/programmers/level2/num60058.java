package programmers.level2;

public class num60058 {
    public String solution(String p) {
        return makeString(p);
    }

    private String makeString(String w) {
        if (w.length() == 0) {
            return "";
        }
        int c = findIndex(w);
        String u = w.substring(0, c);
        String v = w.substring(c);

        if (isCorrect(u)) {
            return u + makeString(v);
        } else {
            String temp = "(" + makeString(v) + ")";
            u = u.substring(1, u.length() - 1);
            u = reverse(u);
            return temp + u;
        }
    }

    private String reverse(String u) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }
        return sb.toString();
    }

    private boolean isCorrect(String w) {
        int c = 0;

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '(') {
                c++;
            } else {
                c--;
            }
            if (c < 0) {
                return false;
            }
        }
        return true;
    }

    private int findIndex(String w) {
        int open = 0;
        int close = 0;

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '(') {
                open++;
            }else {
                close++;
            }
            if (open == close) {
                return i + 1;
            }
        }
        return 0;
    }
}
