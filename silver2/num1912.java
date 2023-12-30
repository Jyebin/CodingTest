package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 1 || (n > (int) Math.pow(10, 6))) {
            throw new IllegalArgumentException("N의 범위가 잘못되었습니다.");
        }

        int[] nums = new int[n]; //수열을 저장할 배열
        int[] dp = new int[n]; //주어진 합을 저장할 배열

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]); //String 값을 int값으로 변환
        }

        int max = dp[0] = nums[0]; //초기화. 첫 번째 원소가 첫 번째 부분 수열의 합

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]); //수열의 현재 숫자와 (이전까지의 값 + 현재숫자)를 비교해서 더 큰 값을 dp에 업데이트
            max = Math.max(max, dp[i]); //현재값이 더 크다면 max값을 현재값으로 지정
        }
        System.out.println(max);
    }
}
