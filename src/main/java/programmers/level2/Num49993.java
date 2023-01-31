package programmers.level2;

public class Num49993 {
    public static void main(String[] args) {
        Num49993 a = new Num49993();
        System.out.println(a.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i = 0; i < skill_trees.length; i++) {
            String pre = skill_trees[i].replaceAll("[^" + skill + "]", "");
            String need = skill.substring(0, pre.length());

            if(pre.equals(need)) {
                answer++;
            }
        }
        return answer;
    }
}
