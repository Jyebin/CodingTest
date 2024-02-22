package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[N + 1][10]; //길이가 i이고 j로 끝나는 수의 게단 수의 개수
        long sum = 0;
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) { //마지막 숫자가 0인 경우
                    dp[i][j] = dp[i - 1][j + 1] % 1000000000; //j가 0이면 항상 1만 와야 하기 때문에 j값을 1빼줌
                } else if (j == 9) { //마지막 숫자가 9인 경우
                    dp[i][j] = dp[i - 1][j - 1] % 1000000000; //j가 9면 앞자리에는 항상 8이 와야 하기 때문에 j값을 빼줌
                } else { //마지막 숫자가 1~8인 경우
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000; //j가 3이면 이전 자릿수에서의 2와 4의 경우를 합산
                }
            }
        }
        for (int i = 0; i <= 9; i++) {
            sum = sum + dp[N][i];
        }
        System.out.println(sum % 1000000000);
        br.close();
    }
}
