import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);

        int cnt = 1;
        while (b != a) {
            if (b < a) {
                System.out.println(-1);
                return;
            }
            String tmp = String.valueOf(b);
            if (b % 2 == 0) {
                b /= 2;
            } else if (tmp.charAt(tmp.length() - 1) == '1') {
                String sb = tmp.substring(0, tmp.length() - 1);
                b = Integer.parseInt(sb);
            } else {
                System.out.println(-1);
                return;
            }
            cnt++;

        }
        System.out.println(cnt);
    }

}

