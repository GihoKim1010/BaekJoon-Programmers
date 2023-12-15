import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		//b를 문자열로 바꿈. bbb라는 배열을 생성.
		String bb = Integer.toString(b);
		int[] bbb=new int[bb.length()];
		
		//bchar는 bb라는 문자열을 자릿수마다 분해하여 하나씩 그 값을 가짐. 예)257입력시 첫번째엔 2, 두번째엔 5, 세번째엔 7이됨.
		//intb는 그 값을 숫자로 변환한값.
		for (int i=0; i<bb.length(); i++) {
			char bchar = bb.charAt(i);
			int intb=Character.getNumericValue(bchar);
			bbb[i]=intb;
		}
		System.out.println(a*bbb[2]);
		System.out.println(a*bbb[1]);
		System.out.println(a*bbb[0]);
		System.out.println(a*b);
	}
}