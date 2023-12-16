import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String a=sc.nextLine();
		String[]b=a.split(" ");
		
		int[]c=new int[b.length];
		
		for(int i=0; i<b.length; i++) {
			c[i]=Integer.parseInt(b[i]);
		}
		
		if(c[0]==c[1]&&c[0]==c[2]) {
			System.out.println((c[0]*1000)+10000);
		}else if(c[0]==c[1]&&c[0]!=c[2]){
			System.out.println((c[0]*100)+1000);
		}else if(c[1]==c[2]&&c[1]!=c[0]){
			System.out.println((c[1]*100)+1000);
		}else if(c[2]==c[0]&&c[2]!=c[1]){
			System.out.println((c[2]*100)+1000);
		}else {
			if(c[0]>c[1]&&c[0]>c[2]) {
				System.out.println(100*c[0]);
			}else if(c[1]>c[2]&&c[1]>c[0]) {
				System.out.println(100*c[1]);
			}else if(c[2]>c[0]&&c[2]>c[1]) {
				System.out.println(100*c[2]);
			}
		}
	}
}