import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[] jeongu;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);

        jeongu = new int[n + 1];

        st = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            jeongu[i] = Integer.parseInt(st[i - 1]);
        }

        for (int i = 0; i < m; i++) {
            st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);

            if (a == 1) {
                jeongu[b] = c;
            } else if (a == 2) {
                for (int j = b; j <= c; j++) {
                    if (jeongu[j] == 0) {
                        jeongu[j] = 1;
                    } else {
                        jeongu[j] = 0;
                    }
                }
            } else if (a == 3) {
                for (int j = b; j <= c; j++) {
                    jeongu[j] = 0;
                }
            } else {
                for (int j = b; j <= c; j++) {
                    jeongu[j] = 1;
                }
            }
        }

        for (int i = 1; i < jeongu.length; i++) {
            System.out.print(jeongu[i] + " ");
        }

    }

}
