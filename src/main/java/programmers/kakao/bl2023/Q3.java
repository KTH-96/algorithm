package programmers.kakao.bl2023;

public class Q3 {

	int[] discountRate = {10, 20, 30, 40};
	int maxSubs = 0;
	int maxIncome = 0;

	public int[] solution(int[][] users, int[] emoticons) {
		dfs(0, emoticons.length, new int[emoticons.length], users, emoticons);
		return new int[]{maxSubs, maxIncome};
	}

	private void dfs(int dept, int length, int[] discounts, int[][] users, int[] emoticons) {
		if (dept == length) {
			int subs = 0;
			int income = 0;
			for (int[] user : users) {
				int rate = user[0];
				int limt = user[1];
				int totalPay = 0;

				for (int i = 0; i < emoticons.length; i++) {
					if (rate <= discounts[i]) {
						totalPay += emoticons[i] * (100 - discounts[i]) / 100;
					}
				}
				if (totalPay >= limt) {
					subs++;
				} else {
					income += totalPay;
				}
			}
			if (subs > maxSubs) {
				maxSubs = subs;
				maxIncome = income;
			} else if (subs == maxSubs) {
				maxIncome = Math.max(income, maxIncome);
			}
			return;
		}

		for (int i = 0; i < discountRate.length; i++) {
			discounts[dept] = discountRate[i];
			dfs(dept+1, length, discounts, users, emoticons);
		}
	}
}
