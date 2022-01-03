package leetcode;

public class Lc557 {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        for(int i = 0; i< split.length; i++){
            split[i] = new StringBuilder(split[i]).reverse().toString();
        }
        s = "";
        for(int i = 0; i< split.length; i++){
            s += split[i] + " ";
        }
        return s.trim();
    }
}
