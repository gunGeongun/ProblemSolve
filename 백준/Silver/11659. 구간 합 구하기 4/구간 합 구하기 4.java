import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer( br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for(int i =1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] sum = new int[n+1];
        for(int i=1;i<=n;i++){
            sum[i] = sum[i-1] + arr[i];
        }
        for(int i =0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(sum[b] - sum[a-1]);
        }


    }

}