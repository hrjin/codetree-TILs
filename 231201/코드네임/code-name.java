import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Emp {
    String name;
    int score;

    public Emp(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Emp[] emps = new Emp[5];
        
        // 각 사람의 정보를 담은 객체를 5개 만들기
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Emp emp = new Emp(st.nextToken(), Integer.parseInt(st.nextToken()));
            emps[i] = emp;
        }

        String lowEmp = "";
        int lowScore = emps[0].score;
        int lowIdx = 0;
        
        for (int j = 0; j < 5; j++) {
            if (j == 4) {
                lowEmp = emps[lowIdx].name;
                break;
            }

            if (lowScore > emps[j + 1].score) {
                lowScore = emps[j + 1].score;
                lowIdx = j + 1;
            }
        }

        System.out.println(lowEmp + " " + lowScore);
    }
}