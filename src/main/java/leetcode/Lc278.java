package leetcode;

public class Lc278 {
    public static void main(String[] args) {
        isBadVersion(4);
    }

    private static boolean isBadVersion(int i) {
        if (i >= 4) {
            return true;
        }
        return false;
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (isBadVersion(mid)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}
