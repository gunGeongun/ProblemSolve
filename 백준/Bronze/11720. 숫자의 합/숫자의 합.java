import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String m = br.readLine();
        char[] cNum = m.toCharArray();
        int sum =0;
        for(int i=0;i<n;i++){
            sum += cNum[i] - '0';
        }

        System.out.print(sum);

        br.close();

    }

}