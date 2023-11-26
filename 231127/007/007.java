import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Mission mission = new Mission(st.nextToken(), st.nextToken(), st.nextToken());

        System.out.println("secret code : " + mission.code);  // 90
        System.out.println("meeting point : " + mission.place);  // 80
        System.out.println("time : " + mission.time); // 90
    }
}

class Mission {
    String code, place, time;

    public Mission(String code, String place, String time){
        this.code = code;
        this.place = place;
        this.time = time;
    }
};