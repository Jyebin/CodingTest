package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class num11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        Integer[] coins = new Integer[N]; //reverseOrder를 사용하기 위하여 int가 아니라 Integer로 선언

        int cnt = 0; //동전개수
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine()); //각각의 동전을 많이 가지고 있음
        }
        Arrays.sort(coins, Collections.reverseOrder()); //내림차순으로 정렬
        for (int i = 0; i < N; i++) {
            if (coins[i] <= K) { //동전이 K보다 작거나 같을 때
                cnt = cnt + K / coins[i]; //나누어지는 개수 -> 몫
                K = K % coins[i]; //나머지
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
