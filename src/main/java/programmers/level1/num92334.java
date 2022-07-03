package programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class num92334 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] ids = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;

		int[] result = solution.solution(ids, report, k);
		for (int i : result) {
			System.out.println(i);
		}
	}

	static class Solution {
		public int[] solution(String[] id_list, String[] report, int k) {
			int[] answer = new int[id_list.length];

			Map<String, HashSet<String>> reportedMap = new HashMap<>();
			Map<String, Integer> answerMap = new HashMap<>();

			for (int i = 0; i < id_list.length; i++) {
				reportedMap.put(id_list[i], new HashSet<>());
				answerMap.put(id_list[i], i);
			}

			for (int i = 0; i < report.length; i++) {
				String[] split = report[i].split(" ");

				String reporter = split[0];
				String target = split[1];

				reportedMap.get(target).add(reporter);
			}

			for (int i = 0; i < id_list.length; i++) {
				HashSet<String> reported = reportedMap.get(id_list[i]);
				if (reported.size() >= k) {
					for (String name : reported) {
						answer[answerMap.get(name)]++;
					}
				}
			}
			return answer;
		}
	}
}
