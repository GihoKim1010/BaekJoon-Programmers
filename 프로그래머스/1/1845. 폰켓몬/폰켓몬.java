import java.util.HashSet;

public class Solution {
	public int solution(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}
		
		int answer = 0;
		if(hs.size()>=nums.length/2) {
			answer=nums.length/2;
		}else {
			answer=hs.size();
		}
		return answer;
	}
}