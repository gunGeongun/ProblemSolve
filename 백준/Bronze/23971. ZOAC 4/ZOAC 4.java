import java.io.*;
public class Main {
    static int h, w, n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        h = Integer.parseInt(st[0]);
        w = Integer.parseInt(st[1]);
        n = Integer.parseInt(st[2]);
        m = Integer.parseInt(st[3]);

        int hResult = (h - 1) / (n + 1) + 1;
        int wResult = (w - 1) / (m + 1) + 1;

        System.out.println(hResult * wResult);

    }
}


