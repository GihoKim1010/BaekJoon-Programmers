import java.util.Scanner;

public class Main {

    static String[][] board;
    static int x,y,n;
    static boolean dir;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dir = n%2 == 1; //true 일땐 정삼각형 / false일땐 역삼각형
        y = 1;
        x = 1;
        for(int i=1; i<=n-1; i++){
            y += (int)Math.pow(2,i);
            x += (int)Math.pow(2,i+1);
        }

        board = new String[y][x];

        int baseY = (dir)? y-1 : 0;
        int topY = (dir)? 0 : y-1;
        int leftX = 0;
        int rightX = x-1;
        drawingTriangle(baseY, topY, leftX, rightX, dir);
        printStars();
    }

    static void drawingTriangle(int baseY, int topY, int leftX, int rightX, boolean dir){

        if(n==0){
            return;
        }

        for(int i=leftX; i<=rightX; i++){
            board[baseY][i]="*";
        }

        int gap =1;
        if(dir){
            for(int i=baseY-1; i>=topY; i--){
                for(int j=0; j<rightX-gap; j++){
                    if(board[i][j]==null){
                        board[i][j]=" ";
                    }
                }
                board[i][rightX-gap]="*";
                board[i][leftX+gap]="*";
                gap++;
            }
        }else{
            for(int i=baseY+1; i<=topY; i++){
                for(int j=0; j<rightX-gap; j++){
                    if(board[i][j]==null){
                        board[i][j]=" ";
                    }
                }
                board[i][rightX-gap]="*";
                board[i][leftX+gap]="*";
                gap++;
            }
        }

        int newBaseY = (baseY+topY)/2;
        int newTopY = (dir) ? baseY - 1 : baseY + 1;
        boolean newDir = !dir;
        int newLeftX = leftX + (rightX-leftX)/4 + 1;
        int newRightX = rightX - (rightX-leftX)/4 - 1;
        n--;

        drawingTriangle(newBaseY, newTopY, newLeftX, newRightX, newDir);
    }

    static void printStars(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                if(board[i][j]!=null) {
                    sb.append(board[i][j]);
                }
            }
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}