package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Num42578 {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 1) + 1);
        }
        return map.values().stream()
                .reduce(1, (a, b) -> a * b) - 1;
    }

    public static void main(String[] args) {
        Num42578 a = new Num42578();
        String[][] aa = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(a.solution(aa));
    }
}
