import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n,k;
    static boolean[][] checked;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        k = Integer.parseInt(st[1]);

        checked = new boolean[n+1][n+1];

        for(int i=0;i<k;i++){
            st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);

            checked[a][b] = true;
            checked[b][a] = true;
        }

        int result = 0;

        for(int i = 1;i<=n;i++){
            for(int j = i+1; j<= n;j++){
                if (!checked[i][j]){
                    for(int z = j+1; z<= n; z++){
                        if(!checked[j][z] && !checked[z][i]){
                            result++;
                        }
                    }
                }

            }
        }
        System.out.println(result);
    }

}
