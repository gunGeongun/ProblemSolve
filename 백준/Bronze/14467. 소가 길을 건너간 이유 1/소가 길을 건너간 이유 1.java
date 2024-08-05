import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static Map<Integer, Integer> map = new HashMap<>();
    private static int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);

            if (map.containsKey(a)) {
                if (map.get(a) != b) {
                    cnt++;
                }
                map.put(a, b);
            } else {
                map.put(a, b);
            }
        }
        System.out.println(cnt);
    }

}

