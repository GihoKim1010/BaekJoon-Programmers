import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
	
	public static void editor (Deque<String> left, Stack<String> right, String input) {
		if(input.equals("L")) {
			if(!left.isEmpty()) {
				right.add(left.pollLast());
			}
		}else if(input.equals("D")) {
			if(!right.isEmpty()) {
				left.addLast(right.pop());
			}
		}else if(input.equals("B")) {
			if(!left.isEmpty()) {
				left.pollLast();
			}
		}else {
			String[] temp = input.split(" ");
			left.addLast(temp[1]);
		}
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sentence = br.readLine();
		Deque<String> left = new LinkedList<>();
		Stack<String> right = new Stack<>();
		int M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<sentence.length(); i++) {
			left.addLast(String.valueOf(sentence.charAt(i)));
		}
		
		for(int i =0; i<M; i++) {
			String input = br.readLine();
			editor(left,right,input);
		}
		StringBuilder result = new StringBuilder();
		
		while(!left.isEmpty()) {
			result.append(left.pollFirst());
		}
		while(!right.isEmpty()) {
			result.append(right.pop());
		}
		
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}