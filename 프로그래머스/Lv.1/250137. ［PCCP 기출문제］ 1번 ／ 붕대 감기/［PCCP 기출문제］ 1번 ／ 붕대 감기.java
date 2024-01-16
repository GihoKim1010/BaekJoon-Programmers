public class Solution {

	public int heal(int[] bandage, int now, int health, int time) {
		if (time < bandage[0]) {
			now += time * bandage[1];
		} else if (time == bandage[0]) {
			now += bandage[0] * bandage[1] + bandage[2];
		} else if (time > bandage[0]) {
			now += bandage[0] * bandage[1] + bandage[2];
			now = heal(bandage, now, health, time - bandage[0]);
		}

		if (now >= health) {
			now = health;
		}

		return now;
	}

	public int solution(int[] bandage, int health, int[][] attacks) {
		int now = health - attacks[0][1];
		if (now <= 0) {
			now = -1;
		} else {
			for (int i = 1; i < attacks.length; i++) {
				now = heal(bandage, now, health, attacks[i][0] - attacks[i-1][0]-1);
				now -= attacks[i][1];
				if(now<=0) {
					now=-1;
					break;
				}
			}
		}
		int answer = now;
		return answer;
	}
}