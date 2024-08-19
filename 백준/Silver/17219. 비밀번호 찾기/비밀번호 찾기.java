import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);

        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            hashMap.put(st[0], st[1]);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(hashMap.get(br.readLine()));
        }


    }
}

