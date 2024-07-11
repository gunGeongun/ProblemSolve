import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=  Integer.parseInt(br.readLine());
        int[] distance = new int[n-1];

        int[] cost = new int[n-1];
        int[] costcpy = new int[n-1];

        String[] di = br.readLine().split(" ");
        for(int i=0;i<n-1;i++){
            distance[i] = Integer.parseInt(di[i]);
        }
        di = br.readLine().split(" ");
        for(int i=0;i<n-1;i++){
            cost[i] = Integer.parseInt(di[i]);
        }

        System.arraycopy(cost,0,costcpy,0,n-1);
        Arrays.sort(cost);
        int min = cost[0];
        int i =0;
        int result =0;
        while(true){
            if(costcpy[i] != min){
                result += (costcpy[i]*distance[i]);
                i++;
            }
            else{
                while(i<costcpy.length){
                    result += (min*distance[i]);
                    i++;
                }
                break;
            }
        }
        System.out.println(result);
    }

}
