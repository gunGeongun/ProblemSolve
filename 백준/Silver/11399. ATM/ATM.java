import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n= Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] s = br.readLine().split(" ");
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        int sum =arr[0];
        for(int i=1;i<n;i++){
            arr[i] = arr[i]+arr[i-1];
            sum += arr[i];
        }
        bw.write(String.valueOf(sum));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}