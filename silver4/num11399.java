package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //사람의 수
        String[] input = br.readLine().split(" ");
        int[] P = new int[N + 1]; //각 사람이 돈을 인출하는 데 걸리는 시간
        int[] dp = new int[N + 1]; //누적합을 저장할 배열

        //index : 사람 번호
        //P[index] : 그 사람이 걸리는 시간
        for (int i = 1; i <= N; i++) {
            P[i] = Integer.parseInt(input[i - 1]);
        }

        //각 사람이 돈을 인출하는 데 시간이 가장 적게 걸려야 함 -> 시간을 기준으로 오름차순 정렬
        Arrays.sort(P);
        dp[0] = 0;
        dp[1] = P[0]; //정렬 후 가장 처음 사람의 대기 시간 저장
        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i - 1] + P[i]; //이전까지의 누적합 + 현재값
        }
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + dp[i];
        }
        System.out.println(sum);
        br.close();
    }
}