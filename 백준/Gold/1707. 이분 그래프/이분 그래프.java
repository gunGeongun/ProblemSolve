import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static boolean[] visited;
    static int[] check;
    static boolean isBinGraph;

    static ArrayList<Integer>[] arr ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0;i < n;i++){
            String[] st = br.readLine().split(" ");
            int V = Integer.parseInt(st[0]);
            int E = Integer.parseInt(st[1]);

            visited = new boolean[V+1];
            check = new int[V+1];
            isBinGraph = true;

            arr = new ArrayList[V + 1];
            for(int j = 1 ; j <= V ; j++ ){
                arr[j] = new ArrayList<>();
            }

            for(int j = 0;j < E ;j++){
                st = br.readLine().split(" ");
                int a = Integer.parseInt(st[0]);
                int b = Integer.parseInt(st[1]);
                arr[a].add(b);
                arr[b].add(a);
            }

            for(int j = 1 ; j <=V;j++){
                if(isBinGraph){
                    dfs(j);
                }
                else{
                    break;
                }
            }
            if(isBinGraph){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }


    }
    public static void dfs(int start){
        visited[start] = true;
        for(int i : arr[start]){
            if(!visited[i]){
                check[i] = (check[start] + 1) % 2;
                dfs(i);
            }
            else if(check[i] == check[start]){
                isBinGraph = false;
            }
        }
    }

}