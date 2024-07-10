import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int k = Integer.parseInt(br.readLine());
        for(int z =0;z<k;z++){
            PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> minheap = new PriorityQueue<>();
            Map<Integer,Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++){
                String[] st = br.readLine().split(" ");
                char fir = st[0].charAt(0);
                int sec = Integer.parseInt(st[1]);
                if(fir == 'I'){
                    map.put(sec,map.getOrDefault(sec,0)+1);
                    maxheap.add(sec);
                    minheap.add(sec);
                }
                else{
                    PriorityQueue<Integer> heap;
                    if(map.size() == 0){
                        continue;
                    }
                    if(sec == 1){
                        heap = maxheap;
                        delMap(heap,map);
                    }
                    else{
                        heap = minheap;
                        delMap(heap,map);
                    }
                }
            }
            if(map.size() == 0){
                System.out.println("EMPTY");
            }
            else{
                int maxnum = delMap(maxheap,map);
                int minnum;
                if(map.size() > 0){
                    minnum = delMap(minheap,map);
                }
                else{
                    minnum = maxnum;
                }
                System.out.println(maxnum +" "+minnum);
            }
        }


    }
    static int delMap(PriorityQueue<Integer> heap,Map<Integer,Integer> map){
        int num;
        while(true){
            num = heap.poll();
            int cnt = map.getOrDefault(num,0);
            if(cnt == 0){
                continue;
            }
            if(cnt == 1){
                map.remove(num);
            }
            else{
                map.put(num,cnt-1);
            }
            break;
        }
        return num;
    }
}
