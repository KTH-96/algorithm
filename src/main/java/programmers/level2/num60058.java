package programmers.level2;

public class num60058 {
    int c = 0;
    public String solution(String p) {
        if (p.equals("")) {
            return p;
        }
        boolean tf = check(p);
        String u = p.substring(0, c);
        String v = p.substring(c);

        if (tf) {
            return u + solution(v);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(solution(v));
        sb.append(")");

        for (int i = 1; i < u.length() - 1; i++) {
            if (u.charAt(i) == '(') {
                sb.append(")");
            }else {
                sb.append("(");
            }
        }
        return sb.toString();
    }

    private boolean check(String p) {
        if (p.charAt(0) == ')'){
            return false;
        }
        int open = 0;
        int close = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                open++;
            }else {
                close++;
            }
            if (open - close< 0) {
                return false;
            }
            if (open == close) {
                c = i + 1;
                return true;
            }
        }
        return true;
    }
}
