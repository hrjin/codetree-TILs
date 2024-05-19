import java.io.*;
import java.util.*;

public class Main {
    public static int[][] array;

    private static int getNum(int rowS, int colS, int rowE, int colE) {
        int num = 0;
        for (int i = rowS; i <= rowE; i++) {
            for (int j = colS; j <= colE; j++) {
                num += array[i][j];
            }
        }
        return num;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        array = new int[n][n];

        int maxGold = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row + 2 >= n || col + 2 >= n) continue;

                int numValue = getNum(row, col, row + 2, col + 2);

                // 최대 금의 개수를 저장합니다.
                maxGold = Math.max(maxGold, numValue);
            }
        }

        System.out.println(maxGold);
    }
}