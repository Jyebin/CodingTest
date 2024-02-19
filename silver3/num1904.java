package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1]; //dp[i]면 길이가 i인 만들 수 있는 모든 조합의 개수를 저장할 배열
        dp[1] = 1; //1
        if (N >= 2) {
            dp[2] = 2; //00, 11
        }
        if (N >= 3) {
            for (int i = 3; i <= N; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
            }
        }
        System.out.println(dp[N]);
        br.close();
    }
}
