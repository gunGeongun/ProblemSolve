import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] points;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        points = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            points[i][0] = a;
            points[i][1] = b;
        }

        int[][] result = grahamScan(points);
        System.out.println(result.length);
    }


    static boolean ccw(int[] i, int[] j, int[] k) {
        long area2 = (long) (j[0] - i[0]) * (k[1] - i[1]) - (long) (j[1] - i[1]) * (k[0] - i[0]);
        return area2 > 0;
    }


    static long distanceSquared(int[] p1, int[] p2) {
        return (long) (p2[0] - p1[0]) * (p2[0] - p1[0]) + (long) (p2[1] - p1[1]) * (p2[1] - p1[1]);
    }


    static int[][] grahamScan(int[][] points) {

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1]) {
                    return Integer.compare(o1[1], o2[1]);
                } else {
                    return Integer.compare(o1[0], o2[0]);
                }
            }
        });

        int[] start = points[0];

        Arrays.sort(points, 1, points.length, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                double angle1 = Math.atan2(o1[1] - start[1], o1[0] - start[0]);
                double angle2 = Math.atan2(o2[1] - start[1], o2[0] - start[0]);
                if (angle1 == angle2) {
                    return Long.compare(distanceSquared(start, o1), distanceSquared(start, o2));
                }
                return Double.compare(angle1, angle2);
            }
        });


        Stack<int[]> result = new Stack<>();
        result.push(start);

        for (int i = 1; i < points.length; i++) {
            while (i < points.length - 1 && isCollinear(start, points[i], points[i + 1])) {
                i++;
            }
            result.push(points[i]);
        }

        Stack<int[]> hull = new Stack<>();
        hull.push(result.get(0));
        hull.push(result.get(1));

        for (int i = 2; i < result.size(); i++) {
            int[] p = result.get(i);

            while (hull.size() >= 2) {
                int[] second = hull.pop();
                int[] first = hull.peek();
                if (ccw(first, second, p)) {
                    hull.push(second);
                    break;
                }
            }

            hull.push(p);
        }

        return hull.toArray(new int[hull.size()][]);
    }

    static boolean isCollinear(int[] p1, int[] p2, int[] p3) {
        long area2 = (long) (p2[0] - p1[0]) * (p3[1] - p1[1]) - (long) (p2[1] - p1[1]) * (p3[0] - p1[0]);
        return area2 == 0;
    }
}
