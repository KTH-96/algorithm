package programmers.level1;

public class num12918 {
    public static void main(String[] args) {
        solution("~11234");
    }
    static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            s = s.toLowerCase();
            int count = 0;
            char[] arr = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                arr[i] = s.charAt(i);
                if (arr[i] - 48 >= 0 && arr[i] - 48 <= 9) {
                    count++;
                }
            }
            System.out.println(s.length());
            System.out.println(count);
            if (s.length() == count) {
                return true;
            }
            return false;
        }else{
            return false;
        }
    }
}
