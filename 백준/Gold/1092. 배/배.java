import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] cranes = new Integer[N];
        for (int i = 0; i < N; i++) {
            cranes[i] = sc.nextInt();
        }
        Arrays.sort(cranes, Collections.reverseOrder());

        int M = sc.nextInt();
        ArrayList<Integer> boxes = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            boxes.add(sc.nextInt());
        }
        Collections.sort(boxes, Collections.reverseOrder());

        int day=0;
        boolean isPossible = true;
        while(!boxes.isEmpty() && isPossible){
            isPossible=false;
            int craneIdx =0, boxIdx = 0;
            int count=0;
            while(craneIdx<N){
                if(boxes.size()==boxIdx){
                    break;
                } else if (cranes[craneIdx]>=boxes.get(boxIdx)) {
                    craneIdx++;
                    count++;
                    boxes.remove(boxIdx);
                    isPossible=true;
                }else{
                    boxIdx++;
                }
            }
            day++;

            if(!isPossible){
                day=-1;
            }
        }
        System.out.println(day);
    }
}