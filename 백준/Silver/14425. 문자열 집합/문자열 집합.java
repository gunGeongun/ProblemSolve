import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);

        Set<String> set = new HashSet<>();

        for(int i=0;i<n;i++){
            String s = br.readLine();
            set.add(s);
        }
        int cnt = 0;
        for(int i=0;i<m;i++){
            String s =br.readLine();
            if(set.contains(s)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}