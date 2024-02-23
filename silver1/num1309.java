package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //우리의 크기
        int[][] dp = new int[N][3]; //dp에는 사자를 배치하는 경우의 수 저장
        //[][0] : 안넣음
        //[][1] : 왼쪽에 넣음
        //[][2] : 오른쪽에 넣음
        dp[0][0] = 1;
        dp[0][1] = 1;
        dp[0][2] = 1;
        int sum = 0;
        for (int i = 1; i < N; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901; //아무것도 넣지 않는 경우에는 앞에서의 비어있는 경우, 왼쪽, 오른쪽이 다 올 수 있음
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901; //왼쪽에 있는 경우에는 앞에서의 비어있는 경우, 오른쪽에 있는 경우
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
        }
        sum = dp[N - 1][0] + dp[N - 1][1] + dp[N - 1][2];
        System.out.println(sum % 9901);
        br.close();
    }
}