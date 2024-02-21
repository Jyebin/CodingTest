package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            long[] dp = new long[N + 1];
            dp[1] = 1;
            if (N > 1) {
                dp[2] = 1;
            }
            if (N > 2) {
                dp[3] = 1;
            }
            for (int j = 4; j <= N; j++) {
                dp[j] = dp[j - 3] + dp[j - 2];
            }

            sb.append(dp[N]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
