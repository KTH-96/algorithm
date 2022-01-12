package leetcode;

public class Lc14 {
    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (temp.length() > strs[i].length()) {
                String swap = temp;
                temp = strs[i];
                strs[i] = swap;
            }
            String answer = "";
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == strs[i].charAt(j)) {
                    answer += String.valueOf(temp.charAt(j));
                } else {
                    break;
                }
            }
            temp = answer;
        }
        return temp;
    }
}
