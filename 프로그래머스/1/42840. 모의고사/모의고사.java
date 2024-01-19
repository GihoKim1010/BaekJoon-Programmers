public class Solution {

	public int st1(int i) {
		return i % 5 + 1;
	}

	public int st2(int i) {
		int a=0;
		if (i % 2 == 0) {
			a= 2;
		} else {
			if (i % 8 == 1 || i % 8 == 3) {
				a= i % 8;
			} else if (i % 8 == 5) {
				a= 4;
			} else if (i % 8 == 7) {
				a= 5;
			}
		}
		return a;
	}
	
	public int st3(int i) {
		int b =0;
		if(i%10==0 || i%10==1) {
			b=3;
		}else if (i%10==2 || i%10==3) {
			b=1;
		}else if (i%10==4 || i%10==5) {
			b=2;
		}else if (i%10==6 || i%10==7) {
			b=4;
		}else if (i%10==8 || i%10==9) {
			b=5;
		}
		return b;
	}

	public int[] solution(int[] answers) {
		int x=0;
		int y=0;
		int z=0;
		
		for(int i =0; i< answers.length; i++) {
			if(st1(i)==answers[i]) {
				x++;
			} 
			if(st2(i)==answers[i]) {
				y++;
			} 
			if(st3(i)==answers[i]) {
				z++;
			} 
		}
		
		if(x>y && x>z) {
			int[] answer = {1};
			return answer;
		}else if(y>x && y>z) {
			int[] answer = {2};
			return answer;
		}else if(z>x && z>y) {
			int[] answer = {3};
			return answer;
		}else if(x==y && x>z) {
			int[] answer = {1,2};
			return answer;
		}else if(x==z && z>y) {
			int[] answer = {1,3};
			return answer;
		}else if(y==z && z>x) {
			int[] answer = {2,3};
			return answer;
		}else {
			int[] answer = {1,2,3};
			return answer;
		}
	}
}
