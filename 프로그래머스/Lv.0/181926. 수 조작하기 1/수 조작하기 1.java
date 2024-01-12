	class Solution {
		public int solution(int n, String control) {

			for (int i = 0; i < control.length(); i++) {
				char temp = control.charAt(i);
				String order=String.valueOf(temp);
				if(order.equals("w")) {
					n+=1;
				}else if(order.equals("s")) {
					n-=1;
				}else if(order.equals("d")) {
					n+=10;
				}else if(order.equals("a")) {
					n-=10;
				}
			}
			int answer = n;
			return answer;
		}
	}