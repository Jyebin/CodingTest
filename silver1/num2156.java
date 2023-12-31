package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //포도주 잔의 개수
        int[] wine = new int[n];
        for (int i = 0; i < n; i++) { //포도주의 양
            wine[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[n + 1]; //각 잔까지 갔을 때 포도주의 최대 용량(i-3번째의 경우가 있기 때문에 용량을 1 키워줌)

        if (n == 1) {
            System.out.println(wine[0]); //잔의 개수가 하나인 경우 그 한 개가 최대값
        } else if (n == 2) {
            System.out.println(wine[0] + wine[1]); //잔의 개수가 두개인 경우 두 개의 합이 최대값
        } else {
            dp[1] = wine[0];
            dp[2] = wine[0] + wine[1]; //i-3이 -1일 경우를 대비하여 i가 3부터 시작해야 하기 때문에 초기화
            for (int i = 3; i <= n; i++) {
                int case1 = dp[i - 1]; //i번째 잔을 선택하지 않는 경우 -> 이전까지의 최대
                int case2 = wine[i - 1] + dp[i - 2];//i번째 잔을 선택하는 경우 -> 현재 잔 + 이전이전 잔까지의 최대
                int case3 = wine[i - 1] + wine[i - 2] + dp[i - 3];//i번째 잔을 선택하는 경우 -> 현재 잔 + 이전 잔 - 이전이전 잔
                dp[i] = Math.max(case1, Math.max(case2, case3));
            }
            System.out.println(dp[n]); //dp에 저장된 마지막 값이 최대
        }
    }
}
