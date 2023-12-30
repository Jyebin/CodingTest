package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //입력값
        if (N < 1 || (N > (int) Math.pow(10, 6))) {
            throw new IllegalArgumentException("N의 범위가 잘못되었습니다.");
        }
        int[] dp = new int[N + 1]; //숫자 i까지의 최소 연산 횟수를 저장하는 배열

        dp[0] = dp[1] = 0; //숫자 0과 1까지의 최소 연산 횟수는 0임

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1; //3번의 경우 : 이전까지의 횟수 + 1회

            if (i % 2 == 0) { //2로 나누어 떨어지는 경우
                int min = dp[i / 2] + 1;
                if (min < dp[i]) {
                    dp[i] = min;
                }
            }
            if (i % 3 == 0) { //3으로 나누어 떨어지는 경우
                int min = dp[i / 3] + 1; //숫자를 3으로 나누고 횟수에는 1을 더함
                if (min < dp[i]) { //최소 횟수 갱신
                    dp[i] = min;
                }
            }

        }
        System.out.println(dp[N]); //가장 큰 수(최종 값)에는 이 수를 1로 만들기 위한 최소한의 횟수가 저장되어 있음
    }

    public static class num11053 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        }
    }
}
