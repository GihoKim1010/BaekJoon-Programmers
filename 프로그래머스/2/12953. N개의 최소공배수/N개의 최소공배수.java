import java.util.Arrays;

public class Solution {
	public int solution(int[] arr) {
		int answer = 1;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 2; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					for (int k = i; k < arr.length; k++) {
						if (arr[k] % j == 0) {
							arr[k] /= j;
						}
					}
					answer *= j;
					j--;
				}
			}
		}
		return answer;
	}
}