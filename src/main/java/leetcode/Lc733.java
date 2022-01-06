package leetcode;

public class Lc733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image.length == 0) {
            return image;
        }

        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void dfs(int[][] image, int x, int y, int target, int newColor) {
        if (x >= image.length || x < 0 || y >= image[0].length || y < 0 || image[x][y] == newColor || image[x][y] != target) {
            return;
        }

        if (image[x][y] == target) {
            image[x][y] = newColor;
        }
        dfs(image, x + 1, y, target, newColor);
        dfs(image, x - 1, y, target, newColor);
        dfs(image, x, y + 1, target, newColor);
        dfs(image, x, y - 1, target, newColor);
    }
}
