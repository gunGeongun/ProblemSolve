import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=  Integer.parseInt(br.readLine());
        long[] distance = new long[n-1];

        long[] cost = new long[n];

        String[] di = br.readLine().split(" ");
        for(int i=0;i<n-1;i++){
            distance[i] = Long.parseLong(di[i]);
        }
        di = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            cost[i] =Long.parseLong(di[i]);
        }
        long min = cost[0];
        long result =0;
        for(int i =0;i<n-1;i++){
            if(cost[i]<min){
                min = cost[i];
            }
            result += (min * distance[i]);
        }
        System.out.println(result);
    }
}
