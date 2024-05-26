import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_NUM = 1000;
    public static int n, m;

    public static ArrayList<Integer>[] graph = new ArrayList[MAX_NUM + 1];
    public static boolean[] visited = new boolean[MAX_NUM + 1];
    public static int vertexCnt = 0;

    public static void DFS(int vertex) {
        // 해당 정점에서 이어져있는 모든 정점을 탐색해줍니다.
        for(int i = 0; i < graph[vertex].size(); i++) {
            int currV = graph[vertex].get(i);
            if(!visited[currV]) {
                // 아직 방문한 적이 없는 정점에 대해서만 탐색을 진행합니다.
                visited[currV] = true;
                vertexCnt++;
                DFS(currV);
            }
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();

        while(m-- > 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());

            graph[x].add(y);
            graph[y].add(x);
        }

        visited[1] = true;
        DFS(1);

        System.out.println(vertexCnt);
    }
}