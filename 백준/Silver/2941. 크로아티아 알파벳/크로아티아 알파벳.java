import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//입력된 문자열
		String x = sc.nextLine();

		//문자열 하나씩 분리 후 y에 저장
		String[] y = new String[x.length()];
		for(int i=0; i<x.length();i++) {
			char temp = x.charAt(i);
			y[i]=String.valueOf(temp);
		}
		
		//문자열 크기에서, 줄여야할 숫자 세기
		int count =0;
		
		//2개로 이루어진 문자들 한개로 만듦.
		for(int i=0; i<y.length-1; i++) {
			if(y[i].equals("c") && y[i+1].equals("=")) {
				count=count+1;
			}else if(y[i].equals("c") && y[i+1].equals("-")) {
				count=count+1;
			}else if(y[i].equals("d") && y[i+1].equals("-")) {
				count=count+1;
			}else if(y[i].equals("l") && y[i+1].equals("j")) {
				count=count+1;
			}else if(y[i].equals("n") && y[i+1].equals("j")) {
				count=count+1;
			}else if(y[i].equals("s") && y[i+1].equals("=")) {
				count=count+1;
			}else if(y[i].equals("z") && y[i+1].equals("=")) {
				count=count+1;
			}
		}
		
		//3개로 이루어진 문자를 한개로 만들기 위함.단, dz= 를 셀 경우 z=도 세지기 때문에 1개만 줄임.
		for(int i=0; i<y.length-2; i++) {
			if(y[i].equals("d") && y[i+1].equals("z") && y[i+2].equals("=")) {
				count=count+1;
			}
		}
		
		//출력
		System.out.println(y.length-count);
	}
}