package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //수열의 길이
        int[][] dp = new int[N][10]; //[각 수열의 길이][맨 마지막 숫자]
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < N; i++) { //길이
            for (int j = 0; j < 10; j++) { //중간 숫자
                for (int k = j; k < 10; k++) {
                    //ex)3이면, i에서 길이가 3일 때이고, ___중, 두 번째 자리가 j가 됨. 그 다음 j를 기준으로 다시 dp를 해서 맨 마지막 숫자와 나올 수 있는 가짓수를 저장
                    dp[i][j] = dp[i][j] + dp[i - 1][k];
                    dp[i][j] = dp[i][j] % 10007;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            sum = dp[N - 1][i] + sum;
        }
        System.out.println(sum % 10007);
        br.close();
    }
}
