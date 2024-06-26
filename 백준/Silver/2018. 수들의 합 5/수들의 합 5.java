import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int start_idx = 1;
        int end_idx =1;
        int count = 1;
        int sum= 1;
        while(end_idx != n){
            if(sum < n){
                end_idx++;
                sum += end_idx;
            }
            else if (sum > n){
                sum -= start_idx;
                start_idx++;
            }
            else{
                count++;
                end_idx++;
                sum += end_idx;

            }
        }
        bw.write(String.valueOf(count));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}