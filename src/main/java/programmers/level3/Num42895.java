package programmers.level3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Num42895 {

	public int solution(int N, int number) {
		if (N == number) {
			return 1;
		}
		List<Set<Integer>> list = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			list.add(new HashSet<>());
		}

		list.get(1).add(N); //숫자 한개로는 자기 자신 뿐
		for (int i = 2; i < 9; i++) {
			for (int j = 1; j < i; j++) {
				union(list.get(i), list.get(j), list.get(i - j)); // 사칙연산
			}
			list.get(i).add(Integer.parseInt(String.valueOf(N).repeat(i)));
		}
		for (Set<Integer> integers : list) {
			if (integers.contains(number)) {
				return list.indexOf(integers);
			}
		}

		return -1;
	}

	private void union(Set<Integer> n, Set<Integer> n1, Set<Integer> n2) {
		for (Integer a : n1) {
			for (Integer b : n2) {
				n.add(a + b);
				n.add(a - b);
				n.add(a * b);
				if (b != 0 || a != 0) {
					n.add(a / b);
				}
			}
		}
	}
}
