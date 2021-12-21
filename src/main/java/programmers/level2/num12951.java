package programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class num12951 {
    public String solution(String s) {
        String[] str = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        String answer = "";
        boolean tf = true;
        for (String ss : str) {
            answer += tf? ss.toUpperCase() : ss;
            tf = ss.equals(" ") ? true : false;
        }
        return answer;
    }

    @Test
    void 정답() {
        Assertions.assertEquals("3people Unfollowed Me", solution("3people unFollowed me"));
    }

}
