package programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class Num49994 {
    public int solution(String dirs) {
        String[] split = dirs.split("");
        Set<String> set = new HashSet<>();
        double x = 0;
        double y = 0;
        for (String s : split) {
            if (s.equals("U") && y < 5) {
                y++;
                set.add(x + "," + (y - 0.5));
            } else if (s.equals("D") && y > -5) {
                y--;
                set.add(x + "," + (y + 0.5));
            } else if (s.equals("R") && x < 5) {
                x++;
                set.add((x - 0.5) + "," + y);
            } else if (s.equals("L") && x > -5) {
                x--;
                set.add((x + 0.5) + "," + y);
            }
        }
        return set.size();
    }
}
