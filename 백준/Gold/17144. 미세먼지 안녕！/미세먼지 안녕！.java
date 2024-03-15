import java.util.Scanner;

public class Main {

	static int[][] room;
	static int r,c,t, purifier;
	static int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		//r:세로길이, c:가로길이, t:경과 시킬 시간
		r=sc.nextInt();
		c=sc.nextInt();
		t=sc.nextInt();
		
		//원래 방 정보
		room = new int[r][c];
		
		for(int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				room[i][j]=sc.nextInt();
				if(room[i][j]==-1) {
					//공기 청정기의 아랫부분 y좌표 저장.
					purifier = i;
				}
			}
		}
		
		int count=0;
		while(count<t) {
			count++;
			purify();
		}
		
		int sum =2;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				sum+=room[i][j];
			}
		}
		
		System.out.println(sum);
	}
	
	static int[][] copyRoom(int[][] room) {
		int newRoom[][] = new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				newRoom[i][j]=room[i][j];
			}
		}
		return newRoom;
	}
	
	//확산 구현
	static int[][] diffusion() {
		int[][] tempRoom = new int[r][c];
		tempRoom[purifier][0]=tempRoom[purifier-1][0]=-1;
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(room[i][j]>=1) {
					int amount = room[i][j];
					
					//상하좌우 중 확산이 가능한 방향 수 count.
					int countDir=0;
					for(int[] dir : directions) {
						int newY=i+dir[0], newX=j+dir[1];
						
						if(newY>=0 && newY<r && newX>=0 && newX<c && room[newY][newX]!=-1) {
							countDir++;
							tempRoom[newY][newX]+=amount/5;
						}
					}
					
					tempRoom[i][j]+=(amount-((amount/5)*countDir));
				}
			}
		}
		return tempRoom;
	}
	
	//확산 후 공기청정 1회
	static void purify(){
		int[][] tempRoom = new int[r][c];
		tempRoom=copyRoom(diffusion());
		
		for(int i=purifier-2; i>0; i--) {
			tempRoom[i][0]=tempRoom[i-1][0];
		}
		
		for(int i=purifier+1; i<r-1; i++) {
			tempRoom[i][0]=tempRoom[i+1][0];
		}
		
		for(int i=0; i<c-1; i++) {
			tempRoom[0][i]=tempRoom[0][i+1];
			tempRoom[r-1][i]=tempRoom[r-1][i+1];
		}
		
		for(int i=0; i<purifier-1; i++) {
			tempRoom[i][c-1]=tempRoom[i+1][c-1];
		}
		
		for(int i=r-1; i>purifier; i--) {
			tempRoom[i][c-1]=tempRoom[i-1][c-1];
		}
		
		for(int i=c-1; i>1; i--) {
			tempRoom[purifier-1][i]=tempRoom[purifier-1][i-1];
			tempRoom[purifier][i]=tempRoom[purifier][i-1];
		}
		
		tempRoom[purifier][1]=tempRoom[purifier-1][1]=0;
		
		room = copyRoom(tempRoom);
	}
}