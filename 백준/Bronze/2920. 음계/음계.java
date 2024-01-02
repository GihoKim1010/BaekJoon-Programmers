import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] temp=new int[8];
		
		for(int i=0; i<8; i++) {
			temp[i]=sc.nextInt();
		}
		
		int[]x=new int[7];
		for(int i=0; i<7; i++) {
			x[i]=temp[i]-temp[i+1];
		}
		
		
		int result=0;
		for(int i=0; i<x.length; i++) {
			if(x[i]!=1 && x[i]!=-1) {
				break;
			}else if(x[i]==1 || x[i]==-1){
				result +=x[i];
			}
		}
		
		if(result==-7) {
			System.out.println("ascending");
		}else if(result==7) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}