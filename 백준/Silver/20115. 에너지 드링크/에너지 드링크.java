import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=  Integer.parseInt(br.readLine());

        String[] di = br.readLine().split(" ");
        Double[] arr = new Double[n];

        for(int i=0;i<n;i++){
            arr[i] = Double.parseDouble(di[i]);
        }
        Arrays.sort(arr,Collections.reverseOrder());

        double max= arr[0];
        double result = max;
        for(int i=1;i<n;i++){
            result += (arr[i]/2);
        }
        System.out.printf("%.1f",result);

    }
}