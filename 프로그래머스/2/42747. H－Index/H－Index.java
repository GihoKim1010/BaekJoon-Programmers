import java.util.Arrays;

public class Solution {
	public int solution(int[] citations) {
		int answer = 0;

		Arrays.sort(citations);
		int x = citations.length;
		
		for(int i =0; i<x; i++) {
			if(citations[i]>=x-i) {
				answer=x-i;
				break;
			}
		}

		return answer;
	}
}