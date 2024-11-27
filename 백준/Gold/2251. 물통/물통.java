import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int capaA, capaB, capaC;
    static boolean[][][] checked= new boolean[201][201][201];
    static ArrayList<Integer> result = new ArrayList<>();

    static ArrayList<Integer>[] arr ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        capaA = Integer.parseInt(st[0]);
        capaB = Integer.parseInt(st[1]);
        capaC = Integer.parseInt(st[2]);
        bfs();

        Collections.sort(result);

        for(int i : result){
            System.out.print(i + " ");
        }


    }

    static void bfs(){
        Queue<Water> queue = new LinkedList<>();

        queue.add(new Water(0,0, capaC));

        while(!queue.isEmpty()){
            Water water = queue.poll();
            int a = water.a;
            int b= water.b;
            int c = water.c;

            if(checked[a][b][c]){
                continue;
            }

            checked[a][b][c] = true;

            if(a== 0){
                result.add(c);
            }

            if(a + b >= capaB){
                queue.add(new Water(a-(capaB-b), capaB, c));
            }else{
                queue.add(new Water(0,a+b,c));
            }

            if(a + c >= capaC){
                queue.add(new Water(a-(capaC-c), b, capaC));
            }else{
                queue.add(new Water(0, b, a+c));
            }

            if(b + a >= capaA){
                queue.add(new Water(capaA, b-(capaA-a), c));
            }else{
                queue.add(new Water(a+b, 0, c));
            }

            if(b + c >= capaC){
                queue.add(new Water(a, b-(capaC-c), capaC));
            }else{
                queue.add(new Water(a, 0, b+c));
            }

            if(c + a >= capaA){
                queue.add(new Water(capaA, b, c-(capaA - a)));
            }else{
                queue.add(new Water(a+c, b, 0));
            }

            if(c + b >= capaB){
                queue.add(new Water(a, capaB, c-(capaB - b)));
            }else{
                queue.add(new Water(a, b+c, 0));
            }


        }


    }


}
class Water{
    int a, b, c;
    Water(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}