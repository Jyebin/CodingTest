package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //퇴사까지 남은 일
        int[] dp = new int[N + 1]; //N번째 날까지 벌 수 있는 최대 페이를 저장하는 배열
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int T = Integer.parseInt(input[0]); //상담을 완료하는데 걸리는 기간
            int P = Integer.parseInt(input[1]); //상담을 했을 때 받을 수 있는 금액
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
            if (i + T <= N) {
                dp[i + T] = Math.max(dp[i + T], dp[i] + P); //상담을 완료한 후의 날짜와 현재까지의 누적된 이익에 상담을 완료한 후의 금액을 비교해서 더 큰 값
            }
        }
        System.out.print(dp[N]);
        br.close();
    }
}