package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int cnt = 0; //연속된 문자열의 개수를 저장할 변수
            int score = 0;
            String[] ox = br.readLine().split(""); //한글자씩 따로 입력받음
            int n = ox.length;
            for (int j = 0; j < n; j++) { //문자열의 길이만큼 반복
                if (ox[j].equals("O")) {
                    cnt++;
                    score = score + cnt;
                } else { //틀린 문제일 경우 cnt값 초기화
                    cnt = 0;
                }
            }
            System.out.println(score);
        }
        br.close();
    }
}
