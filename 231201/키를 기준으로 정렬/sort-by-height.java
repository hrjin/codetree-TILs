import java.io.*;
import java.util.*;

class BodyInfo implements Comparable<BodyInfo> {
    String name;
    int tall, weight;

    public BodyInfo(String name, int tall, int weight) {
        this.name = name;
        this.tall = tall;
        this.weight = weight;
    }

    @Override
    public int compareTo(BodyInfo BodyInfo) {
        return this.tall - BodyInfo.tall;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        BodyInfo[] bodyInfos = new BodyInfo[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            bodyInfos[i] = new BodyInfo(st2.nextToken(), Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()));
        }

        Arrays.sort(bodyInfos);

        for (int j = 0; j < n; j++) {
            System.out.println(bodyInfos[j].name + " " + bodyInfos[j].tall + " " + bodyInfos[j].weight);
        }
    }
}