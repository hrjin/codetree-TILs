import java.util.*;
import java.io.*;

public class Main {
    public static Stack<Integer> s = new Stack<>();
    private static void printStack(String a, int b) {
        switch(a) {
            case "push":
                s.push(b);
                break;
            case "size":
                System.out.println(s.size());
                break;
            case "empty":
                System.out.println(s.isEmpty()?"1":"0");
                break;
            case "pop":
                System.out.println(s.pop());
                break;
            case "top":
                System.out.println(s.peek());
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            //System.out.println(a + " & " + num);
            printStack(a, num);
        }
    }
}