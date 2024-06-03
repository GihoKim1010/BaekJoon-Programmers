import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dpLeft = new int[n];
        int[] dpRight = new int[n];
        int[] dpSum = new int[n];
        Arrays.fill(dpLeft, 1);
        Arrays.fill(dpRight, 1);

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++){
            for(int j = i; j >= 0; j--){
                if(arr[i] > arr[j]){
                    dpLeft[i]=Math.max(dpLeft[i],dpLeft[j]+1);
                }
            }
        }

        for(int i = n-2; i >= 0; i--){
            for(int j = i; j < n; j++){
                if(arr[i] > arr[j]){
                    dpRight[i]=Math.max(dpRight[i],dpRight[j]+1);
                }
            }
        }

        int max=0;
        for(int i=0;i<n;i++){
            dpSum[i]=dpLeft[i]+dpRight[i]-1;
            max=Math.max(max,dpSum[i]);
        }
        System.out.println(max);
    }
}