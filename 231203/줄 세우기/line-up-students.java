import java.io.*;
import java.util.*;

class StudentInfo implements Comparable<StudentInfo> {
    int idx, tall, weight;

    public StudentInfo (int idx, int tall, int weight) {
        this.idx = idx;
        this.tall = tall;
        this.weight = weight;
    }

    @Override
    public int compareTo(StudentInfo studentInfo) {
        if (studentInfo.tall == this.tall) {
            if (studentInfo.weight == this.weight) return this.idx - studentInfo.idx;
            return studentInfo.weight - this.weight;
        }

        return studentInfo.tall - this.tall;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        StudentInfo[] infos = new StudentInfo[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            infos[i] = new StudentInfo(i+1, Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()));
        }

        Arrays.sort(infos);

        for (int j = 0; j < n; j++) {
            System.out.println(infos[j].tall + " " + infos[j].weight + " " + infos[j].idx);
        }
    }
    
}