package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //삼각형의 크기
        int[][] tri = new int[n][n];
        int[][] dp = new int[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j <= i; j++) {
                tri[i][j] = Integer.parseInt(input[j]);
            }
        }
        dp[0][0] = tri[0][0]; //첫 번째 값
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + tri[i][0]; //왼쪽 끝
            dp[i][i] = dp[i - 1][i - 1] + tri[i][i]; //오른쪽 끝
            for (int j = 1; j < i; j++) { //i가 1~(n-1)일 때 j도 1~(n-1)
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + tri[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[n - 1][i]); //맨 아래 값들 중에서 최대값 찾기
        }
        System.out.print(max);
        br.close();
    }
}
