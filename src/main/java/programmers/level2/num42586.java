package programmers.level2;

import java.util.LinkedList;

public class num42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int day = getDay(progresses[i], speeds[i]);
            days[i] = day;
        }

        LinkedList<Integer> list = new LinkedList<>();

        int prev = days[0];
        int count = 1;
        for (int i = 1; i <= days.length; i++) {
            if (prev < days[i]) {
                list.add(count);
                count = 1;
                prev = days[i];
            }else if (days[i] != 0){
                count++;
            }else {
                break;
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    private int getDay(int progress, int speed) {
        int day = 1;
        while (progress + (speed*day) < 100){
            day++;
        }
        return day;
    }


}
