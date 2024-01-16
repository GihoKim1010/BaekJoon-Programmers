public class Solution {

    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] map = new String[park.length][park[0].length()];
        
        for(int i=0; i<park.length; i++) {
        	for(int j=0; j<park[0].length(); j++) {
        		map[i][j]=String.valueOf(park[i].charAt(j));
        		if(map[i][j].equals("S")) {
        			answer[0]=i;
        			answer[1]=j;
        		}
        	}
        }
        
        for(int i=0; i<routes.length; i++) {
        	String[] order = routes[i].split(" ");
        	int num=Integer.valueOf(order[1]);
        	int[] temp = answer.clone();
        	
        	for(int j=1; j<=num; j++) {
        		if(order[0].equals("N")) {
        			temp[0]--;
        			if(temp[0]<0 || map[temp[0]][temp[1]].equals("X")) {
        				temp=answer.clone();
        				break;
        			}
        		}else if(order[0].equals("S")) {
        			temp[0]++;
        			if(temp[0]>=park.length || map[temp[0]][temp[1]].equals("X")) {
        				temp=answer.clone();
        				break;
        			}
        		}else if(order[0].equals("W")) {
        			temp[1]--;
        			if(temp[1]<0 || map[temp[0]][temp[1]].equals("X")) {
        				temp=answer.clone();
        				break;
        			}
        		}else if(order[0].equals("E")) {
        			temp[1]++;
        			if(temp[1]>=park[0].length() || map[temp[0]][temp[1]].equals("X")) {
        				temp=answer.clone();
        				break;
        			}
        		}
        	}
        	answer=temp.clone();
        }
        return answer;
    }
}