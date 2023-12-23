import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x=sc.nextInt();
		int y=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		//상,하,좌,우 방향 경계선까지의 거리
		int[] distance=new int[4];
		
		distance[0] = h-y;	//위까지의 거리
		distance[1] = y;	//아래까지의 거리
		distance[2] = x;	//왼쪽까지의 거리
		distance[3] = w-x;	//오른쪽까지의 거리
		
		int min=distance[0];
		
		for(int i=0; i<4; i++) {
			if(min>distance[i]) {
				min=distance[i];
			}
		}
		System.out.println(min);
	}
}