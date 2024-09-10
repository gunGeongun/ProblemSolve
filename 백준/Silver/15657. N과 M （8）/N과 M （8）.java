import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,m;
    static int arr[];
    static int num[];

    static boolean visited[];

    static Set<String> set;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);
        st = br.readLine().split(" ");
        arr = new int[n];
        num = new int[m];
        visited = new boolean[n];
        for(int i = 0 ;i<n;i++){
            arr[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(arr);

        set = new LinkedHashSet<>();

        dfs(0, 0);

        Iterator<String> iter = set.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }
    static void dfs(int depth, int start){
        if(depth == m){
            String tmp = "";
            for(int n : num){
                tmp += n + " ";
            }
            set.add(tmp);
            return;
        }

        for (int i = start; i < n; i++) {
            num[depth] = arr[i];
            dfs(depth + 1, i);  // i를 그대로 넘기면 중복 허용, i + 1을 넘기면 중복 불허
        }

    }
}