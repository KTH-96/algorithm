package leetcode;

import java.util.HashSet;

public class Lc3 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int count = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (right < s.length()) {
            if (!hashSet.contains(s.charAt(right))) {
                hashSet.add(s.charAt(right));
                right++;
                count = Math.max(hashSet.size(), count);
            } else {
                hashSet.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}
