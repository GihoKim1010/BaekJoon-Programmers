import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	private static String text, pattern;
	private static int[] pi;
	private static ArrayList<Integer> answer;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		text = br.readLine();
		pattern = br.readLine();
		pi = new int[pattern.length()];
		answer=new ArrayList<>();
		kmp();
		
		StringBuilder result = new StringBuilder();
		result.append(answer.size()).append("\n");
		
		for(int i=0; i<answer.size(); i++) {
			result.append(answer.get(i)+" ");
		}
		
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
	
	//찾을 패턴의 앞쪽 부분문자열들을 검사해서, 접두사와 접미사가 같은 길이를 저장
	private static void makePi() {
		int index =0;
		for(int i=1; i<pattern.length(); i++) {
			while(index>0 && pattern.charAt(index)!=pattern.charAt(i)) {
				index = pi[index-1];
			}
			
			if(pattern.charAt(index)==pattern.charAt(i)) {
				index++;
				pi[i]=index;
			}
		}
	}
	
	private static void kmp() {
		makePi();
		int index=0;
		
		for(int i=0; i<text.length(); i++) {
			while(index>0 && text.charAt(i)!=pattern.charAt(index)) {
				index=pi[index-1];
			}
			
			if(text.charAt(i)==pattern.charAt(index)) {
				if(index==pattern.length()-1) {
					answer.add(i-index+1);
					index=pi[index];
				}else {
					index+=1;
				}
			}
		}
	}
}