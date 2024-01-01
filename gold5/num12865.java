package gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]); //물품의 수
        int K = Integer.parseInt(input1[1]); //준서가 버틸 수 있는 무게
        int[][] inBag = new int[N][2]; //이중 배열의 첫 번째 방에 무게를, 두 번째 방에 가치를 저장
        for (int i = 0; i < N; i++) {
            String[] input2 = br.readLine().split(" ");
            inBag[i][0] = Integer.parseInt(input2[0]); //물건의 무게 W
            inBag[i][1] = Integer.parseInt(input2[1]); //물건의 가치 V
        }
        int[][] dp = new int[N + 1][K + 1]; //dp배열 : 현재 담는 물건별로 가치를 저장할 이중배열
        // for문의 초기값을 1로 지정할 것이기 때문에 배열 크기를 1씩 늘려줌

        for (int i = 1; i <= N; i++) { //물건의 개수만큼 반복
            for (int j = 1; j <= K; j++) { //버틸 수 있는 무게까지 반복
                if (inBag[i - 1][0] <= j) { //가방에 넣을 수 있으면
                    //for문의 시작이 1이기 때문에 inBag와 index를 맞춰 주기 위하여 1을 뺌
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - inBag[i - 1][0]] + inBag[i - 1][1]); //이전까지의 값과 현재 물건을 가방에 넣었을 때의 값을 비교해서 큰 값을 dp에 저장
                } else { //넣을 수 없으면
                    dp[i][j] = dp[i - 1][j]; //이전까지의 값이 최대값
                }
            }
        }
        System.out.println(dp[N][K]);
        br.close();
    }
}
