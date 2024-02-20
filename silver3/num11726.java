package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1]; //n개의 타일을 사용해서 만들 수 있는 조합의 개수를 담을 배열
        dp[1] = 1;
        if (n >= 2) {
            dp[2] = 2;
        }
        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
            }
        }
        System.out.print(dp[n]);
        br.close();
    }
}
