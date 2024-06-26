import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(arr);
        int i = 0;
        int j= n-1;
        int count =0;
        while(i<j){
            if(arr[i] + arr[j] < m){
                i++;
            }
            else if (arr[i]+arr[j] > m){
                j--;
            }
            else if(arr[i] + arr[j] ==  m){
                count++;
                i++;j--;
            }
        }
        bw.write(String.valueOf(count));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}