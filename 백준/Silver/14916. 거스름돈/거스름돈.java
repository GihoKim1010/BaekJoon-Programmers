import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int count =0;
		
		//5원으로 최대한 만든 후, 나머지를 2원, 남은 1원 또는 0원은 remain에 저장.
		int countFive = n/5;
		int countTwo = (n%5)/2;
		int remain = n-(countFive*5)-(countTwo*2);
		
		if(remain==1) {
			if(countFive!=0) {
				countFive--;
				countTwo+=3;
				count=countFive+countTwo;
			}else {
				count=-1;
			}
		}else {
			count=countFive+countTwo;
		}
		System.out.println(count);
	}
}