import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int count;
    static int arr[];

    static void insertion_sort(int list[], int n) {
        int i, j, key;

        for (i = 1; i < n; i++) {
            key = list[i];

            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                count++;
                list[j + 1] = list[j];
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            arr = new int[20];
            count = 0;
            String[] st = br.readLine().split(" ");
            for (int j = 0; j < st.length - 1; j++) {
                arr[j] = Integer.parseInt(st[j + 1]);
            }
            insertion_sort(arr, 20);
            System.out.println(i + 1 + " " + count);
        }
    }
}

