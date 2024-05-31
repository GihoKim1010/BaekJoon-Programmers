import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[31];
        arr[2]=3; arr[4]=11;
        for (int i = 6; i <= n; i++) {
            if(i%2==0){
                arr[i]=(3*arr[i-2])+2;
                for(int j=i-4; j>=0; j-=2){
                    arr[i]+=2*arr[j];
                }
            }else{
                arr[i]=0;
            }
        }
        System.out.println(arr[n]);
    }
}