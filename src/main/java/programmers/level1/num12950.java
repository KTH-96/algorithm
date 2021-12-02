package programmers.level1;

public class num12950 {
    public static void main(String[] args) {
        num12950 main = new num12950();
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};
        int[][] solution = main.solution(arr1, arr2);
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                System.out.println(solution[i][j]);
            }
        }
    }
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
