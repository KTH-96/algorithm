package programmers.cacao2021;



public class replaceAll {
    public static void main(String[] args) {


    }
    static int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
