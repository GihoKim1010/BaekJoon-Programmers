public class Solution {
	public String solution(String code) {
		StringBuilder ret = new StringBuilder();
		int mode = 0;
		for (int i = 0; i < code.length(); i++) {
			char temp = code.charAt(i);
			switch (mode) {
			case 0:
				if(temp!='1' && i%2==0) {
					ret.append(temp);
				}else if(temp=='1') {
					mode=1;
				}
				break;
			case 1:
				if(temp!='1' && i%2==1) {
					ret.append(temp);
				}else if(temp=='1') {
					mode=0;
				}
				break;
			}
		}
		String answer = ret.toString();
		if(answer.length()==0) {
			answer="EMPTY";
		}
		return answer;
	}
}