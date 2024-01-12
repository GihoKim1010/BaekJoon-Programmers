public class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
        	answer[i]=arr[i];
        }
        
        if(arr.length%2==1) {
        	for(int i=0; i<arr.length; i+=2) {
        		answer[i]=arr[i]+n;
        	}
        }else if(arr.length%2==0 && arr.length!=1) {
        	for(int i=1; i<arr.length; i+=2) {
        		answer[i]=arr[i]+n;
        	}
        }
        return answer;
    }
}