package programmers.level1;

public class num12944 {
    public static void main(String[] args) {
        num12944 a = new num12944();
        int[] arr = {1, 2, 3, 4};
        double solution = a.solution(arr);
        System.out.println(solution);
    }
    public double solution(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double result = sum / arr.length;

        return result;
    }
}
