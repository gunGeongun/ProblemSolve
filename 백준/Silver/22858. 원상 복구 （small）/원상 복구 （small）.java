import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int n,k;
    static int shuffled[];
    static int origin[];
    static int tmp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        k = Integer.parseInt(st[1]);
        shuffled = new int[n];
        origin = new int[n];
        tmp = new int[n];

        st = br.readLine().split(" ");
        for(int i =0; i<n; i++){
            shuffled[i] = Integer.parseInt(st[i]);
        }
        st = br.readLine().split(" ");
        for(int i =0 ;i<n;i++){
            origin[i] = Integer.parseInt(st[i]);
        }
        for(int j = 0 ;j<k;j++){
            for(int i= 0;i<n;i++){
                tmp[origin[i]-1] = shuffled[i];
            }
            shuffled = Arrays.copyOf(tmp, tmp.length);
        }
        for(int i =0 ;i<n;i++){
            System.out.print(tmp[i] + " ");
        }
    }

}
