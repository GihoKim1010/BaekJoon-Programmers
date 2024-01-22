import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public int solution(int k, int[] tangerine) {
		int answer = 0;
		ArrayList<Integer> ar = new ArrayList<>();
		Arrays.sort(tangerine);
		int count=1;
		for(int i =1; i<tangerine.length; i++) {
			if(tangerine[i-1]!=tangerine[i]) {
				ar.add(count);
				count=1;
			}else {
				count++;
			}
		}
		
		ar.add(count);
		
		Collections.sort(ar);
		int sum=0;
		int x=ar.size()-1;
		while(sum<k) {
			sum+=ar.get(x);
			answer++;
			x--;
		}
		
		return answer;
	}
}