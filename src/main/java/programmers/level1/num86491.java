package programmers.level1;

public class num86491 {
    public static void main(String[] args) {
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result = solution(arr);
        System.out.println(result);
    }
    public static int solution(int[][] sizes) {
        int maxwidth = 0;
        int maxheight = 0;
        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            maxwidth = Math.max(maxwidth, w);
            maxheight = Math.max(maxheight, h);
        }
        return maxheight * maxwidth;
    }
}
