import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int m = Integer.parseInt(st[0]);
        int n = Integer.parseInt(st[1]);

        int[] arr = new int[n+1];

        for(int i =2;i<=n;i++){
            arr[i] = i;
        }


        for(int i = 2;i<=Math.sqrt(n);i++){
            if(arr[i] == 0 ){
                continue;
            }
            for(int j = i + i ; j<=n; j = j + i){
                arr[j] = 0;
            }
        }

        for(int i = m;i<=n;i++){
            if(arr[i] != 0){
                System.out.println(arr[i]);
            }
        }

    }

}
