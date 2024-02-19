package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[n + 1]; //1,2,3의 합을 이용해서 만들 수 있는 n의 개수를 저장할 배열
            dp[1] = 1; //1
            if (n >= 2) {
                dp[2] = 2; //1+1, 2
            }
            if (n >= 3) {
                dp[3] = 4; //1+1+1, 1+2, 3, 2+1
            }
            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }
            System.out.println(dp[n]);
        }
        br.close();
    }
}
