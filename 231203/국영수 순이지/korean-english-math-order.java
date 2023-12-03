import java.io.*;
import java.util.*;

class Score implements Comparable<Score> {
    String name;
    int korean, english, math;

    public Score(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Score score) {
        if(this.korean == score.korean) {
             if (this.english == score.english) {
                return score.math - this.math;
             }
            return score.english - this.english;
        }    
        return score.korean - this.korean;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        Score[] scores = new Score[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            scores[i] = new Score(st2.nextToken(), Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()));
        }

        Arrays.sort(scores);

        for (int j = 0; j < n; j++) {
            System.out.println(scores[j].name + " " + scores[j].korean + " " + scores[j].english + " " + scores[j].math);
        }
    }
}