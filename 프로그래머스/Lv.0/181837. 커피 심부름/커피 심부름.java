public class Solution {
    public int solution(String[] order) {
    	int answer = 0;
    	int price =0;
    	for(int i=0; i<order.length; i++) {
    		if(order[i].contains("cafelatte")) {
    			price=5000;
    		}else {
    			price=4500;
    		}
    		answer+=price;
    	}
        return answer;
    }
}
