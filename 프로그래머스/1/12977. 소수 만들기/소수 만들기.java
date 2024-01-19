public class Solution {
	
	public boolean judge(int x) {
		boolean temp =true;
		for(int i=2; i*i<=x; i++) {
			if(x%i==0) {
				temp=false;
			}
		}
		return temp;
	}
	
    public int solution(int[] nums) {
        int answer = 0;
        int sum=0;
        for(int i =0; i<nums.length-2; i++) {
        	for (int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			sum=nums[i]+nums[j]+nums[k];
        			if(judge(sum)) {
        				answer++;
        			}
        		}
        	}
        }
        return answer;
    }
}