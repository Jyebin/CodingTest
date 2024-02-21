package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //집의 수
        int[][] input = new int[N][3]; //[][0] : red, [][1] : green, [][2] : blue
        int[][] dp = new int[N][3]; //각 색별로의 최소값을 저장할 변수
        for (int i = 0; i < N; i++) {
            String[] input2 = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                input[i][j] = Integer.parseInt(input2[j]);
            }
        }
        dp[0][0]= input[0][0];
        dp[0][1]= input[0][1];
        dp[0][2]= input[0][2];

        for (int i = 1; i < N; i++) { //i는 몇 번째 집인지를 나타냄
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + input[i][0]; //첫 집으로 빨강을 선택했을 때->이전 집의 초록,파랑 값만 비교하면 됨
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + input[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + input[i][2];
            //빨간색을 선택하는 경우에는 초록, 파랑만 비교함 -> 3줄을 모두 따질 필요가 없음. 한줄씩 따져서 다음 집의 색에 맞게 최소값을 구하기 때문
        }
        System.out.println(Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2])));
        br.close();
    }
}
