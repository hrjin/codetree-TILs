import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*; 

public class Main {
    static int n = 0;
    static Integer[] arr;
    public static void sort() {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");

        System.out.println();
        Arrays.sort(arr, Collections.reverseOrder());
        for(int j = 0; j < arr.length; j++) 
          System.out.print(arr[j] + " ");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine()); 

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            arr[i] = val;
        }
       sort();
    }
}