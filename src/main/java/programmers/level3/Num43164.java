package programmers.level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Num43164 {
    List<String> cities;
    boolean[] visited;
    public String[] solution(String[][] tickets) {
        cities = new ArrayList<>();
        visited = new boolean[tickets.length];

        dfs(tickets, "ICN", "ICN",0);

        Collections.sort(cities);
        return cities.get(0).split("-");
    }

    private void dfs(String[][] tickets, String nowCity, String route, int depth) {
        if (depth == tickets.length) {
            cities.add(route);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(nowCity) && !visited[i]) {
                visited[i] = true;
                dfs(tickets, tickets[i][1], route + "-" + tickets[i][1], depth + 1);
                visited[i] = false;
            }
        }
    }

}
