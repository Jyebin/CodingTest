package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //계단의 개수
        int[] stairs = new int[N + 1]; //계단의 점수를 저장할 배열
        int[] dp = new int[N + 1]; //점수의 최댓값을 저장할 배열

        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = stairs[1];
        if (N >= 2) {
            dp[2] = stairs[1] + stairs[2];
            for (int i = 3; i <= N; i++) {
                dp[i] = Math.max(dp[i - 3] + stairs[i - 1], dp[i - 2]) + stairs[i]; //계단을 '두개+하나' 밟는 경우와 '두개'만 밟는 경우를 비교
            }
        }
        System.out.print(dp[N]);
        br.close();
    }
}