import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int arr[],list[];
    static boolean visited[];
    static int n,m;
    static Set<String> set;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");

        visited = new boolean[n];
        arr = new int[m];
        list = new int[n];

        for(int i = 0 ; i<n;i++){
            list[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(list);

        set = new LinkedHashSet<>();

        dfs(0, m);
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    static void dfs(int depth, int m){
        if(depth == m){
            String temp = "";
            for (int element : arr) {
                temp += element + " ";
            }
            set.add(temp);
            return;
        }
        for(int i = 0; i<n;i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = list[i];
                dfs(depth + 1, m);
                visited[i] = false;
            }
        }
    }
}