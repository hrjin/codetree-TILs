import java.io.*;
import java.util.*;

class Distance implements Comparable<Distance> {
    int idx, dist;

    public Distance(int idx, int dist) {
        this.idx = idx;
        this.dist = dist;
    }

    @Override
    public int compareTo(Distance distance) {
        if (dist != distance.dist)
            return dist - distance.dist;
        return idx - distance.idx;
    }
}

public class Main {
    // 원점과의 거리 계산 함수
    public static int getDistFromOrigin(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Distance[] distances = new Distance[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            distances[i] = new Distance(i+1, getDistFromOrigin(Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken())));
        }

        Arrays.sort(distances);

        for (int j = 0; j < n; j++) {
            System.out.println(distances[j].idx);
        }
    }
}