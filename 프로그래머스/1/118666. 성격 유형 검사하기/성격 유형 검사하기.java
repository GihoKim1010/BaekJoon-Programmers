public class Solution {
    public String solution(String[] survey, int[] choices) {
        
        int[] result = new int[4]; //RT , CF, JM, AN 순.
        
        for(int i =0; i<survey.length; i++) {
        	if(survey[i].equals("RT")) {
        		result[0] +=(choices[i]-4);
        	}else if(survey[i].equals("TR")) {
        		result[0] -=(choices[i]-4);
        	}else if(survey[i].equals("CF")) {
        		result[1] +=(choices[i]-4);
        	}else if(survey[i].equals("FC")) {
        		result[1] -=(choices[i]-4);
        	}else if(survey[i].equals("JM")) {
        		result[2] +=(choices[i]-4);
        	}else if(survey[i].equals("MJ")) {
        		result[2] -=(choices[i]-4);
        	}else if(survey[i].equals("AN")) {
        		result[3] +=(choices[i]-4);
        	}else if(survey[i].equals("NA")) {
        		result[3] -=(choices[i]-4);
        	}
        }
        
        StringBuilder temp = new StringBuilder();

        if(result[0]<=0) {
        	temp.append("R");
        }else {
        	temp.append("T");
        }
        if(result[1]<=0) {
        	temp.append("C");
        }else {
        	temp.append("F");
        }
        if(result[2]<=0) {
        	temp.append("J");
        }else {
        	temp.append("M");
        }
        if(result[3]<=0) {
        	temp.append("A");
        }else {
        	temp.append("N");
        }
        
        String answer = temp.toString();
        return answer;
    }
}