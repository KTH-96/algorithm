package programmers.level1;

public class num12948 {
    public String solution(String phone_number) {
        String answer = phone_number.substring(0, phone_number.length() - 4);
        String answer1 = phone_number.substring(phone_number.length() - 4, phone_number.length());

        answer= answer.replaceAll("[0-9]","*");

        return answer + answer1;
    }
}
