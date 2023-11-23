import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            a[i] = val;
        }


        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        for (int j = 0; j < n; j++) {
            int val = Integer.parseInt(st2.nextToken());
            b[j] = val;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        boolean bResult = true;
        for (int k = 0; k < n; k++) {
            if (a[k] != b[k]) {
                bResult = false;
            }
        }

        if (bResult) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}