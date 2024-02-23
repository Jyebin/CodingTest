package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //구매하려고 하는 카드의 개수
        String[] input = br.readLine().split(" ");
        int[] P = new int[N + 1]; //카드팩의 가격을 저장할 배열
        for (int i = 1; i <= N; i++) {
            P[i] = Integer.parseInt(input[i - 1]); //index는 카드가 들어있는 개수이고, P는 지불해야 할 값임
        }
        int[] dp = new int[N + 1]; //카드를 구매 하는 데 필요한 금액
        for (int i = 1; i <= N; i++) { //카드가 들어 있는 개수
            for (int j = 1; j <= i; j++) { //현재 카드 개수. 2개면 1일 때와 2일 때를 다 비교해야 함
                dp[i] = Math.max(dp[i], dp[i - j] + P[j]); //현재값이랑, 더 작은 것들을 구매해서 나오는 가격이랑 비교하여 더 큰 값을 저장
                //dp[i-j]+P[j]는 i-j개의 카드를 구매한 후 j개의 카드를 추가로 구매하는 경우
            }
        }
        System.out.println(dp[N]);
        br.close();
    }
}