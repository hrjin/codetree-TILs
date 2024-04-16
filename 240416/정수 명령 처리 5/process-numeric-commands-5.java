import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> arr = new ArrayList();

    public static void pushBack(int A) {
        arr.add(A);
        //System.out.println(arr.toString());
    }

    public static void popBack() {
        arr.remove(arr.size() - 1);
    }

    public static void printSize() {
        System.out.println(arr.size());
    }

    public static void get(int k) {
        System.out.println(arr.get(k - 1));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String guide = st.nextToken();
            int num = 0;
            while (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            //System.out.println(guide + " & " + num);

            if ("push_back".equals(guide)) {
                pushBack(num);
            }

            if ("pop_back".equals(guide)) {
                popBack();
            }

            if ("size".equals(guide)) {
                printSize();
            }

            if ("get".equals(guide)) {
                get(num);
            }
        }
        
    }
}