package gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); //동전 종류의 개수
        int k = Integer.parseInt(input[1]); //동전 가치의 합
        int[] dp = new int[k+ 1]; //index에는 총액, dp에는 만들 수 있는 가짓수를 저장할 배열
        int[] coinValue = new int[n + 1]; //동전의 가치를 저장해 둘 금액
        for (int i = 1; i <= n; i++) {
            coinValue[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 1; //0원을 만들 수 있는 가짓수는 1개
        for (int i = 1; i <= n; i++) { //각 동전의 가치를 순회
            for (int j = coinValue[i]; j <= k; j++) { //현재 동전을 추가했을 때 만들 수 있는 금액을 구하기 위해 coinValue[i]부터 시작
                dp[j] = dp[j] + dp[j - coinValue[i]]; //금액이 j일 때 만들 수 있는 가짓수는 j일 때 만들 수 있는 가짓수 + 현재 동전 추가 전 만들 수 있던 가짓수
            }
        }
        System.out.println(dp[k]);
        br.close();
    }
}
