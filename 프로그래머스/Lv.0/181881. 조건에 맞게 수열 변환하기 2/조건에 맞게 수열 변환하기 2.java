import java.util.Arrays;

public class Solution {
	public int solution(int[] arr) {
		int answer = -1;
		int[] temp=arr;
		int[] temp2= {};
		while (!Arrays.equals(temp2, temp)) {
			answer++;
			temp2=Arrays.copyOf(temp, temp.length);
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] >= 50 && temp[i] % 2 == 0) {
					temp[i] /= 2;
				}else if(temp[i]<50 && temp[i]%2==1) {
					temp[i]=temp[i]*2+1;
				}
			}
		}
		return answer;
	}
}