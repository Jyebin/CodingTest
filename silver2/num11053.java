package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" "); //수열 입력받는 부분
        int[] A = new int[N]; //수열
        int[] dp = new int[N]; //길이를 저장할 배열
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        int maxLength = 0; //최대 길이
        Arrays.fill(dp,1); //i번째에서의 모든 최소 길이를 1로 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) { //i번째 이전 값까지 반복
                //i번째에 저장된 길이와 i-1번째까지 다시 반복했을 때의 길이를 비교해줘야 함
                if (A[i] > A[j]) { //현재숫자랑 이전숫자랑 비교해서 현재값이 크면(=수열이 만들어 질 수 있으면)
                    dp[i] = Math.max(dp[i], dp[j] + 1); //현재 숫자에서의 최대 길이와 현재숫자 이전까지의 길이 중 더 큰 길이로 업데이트
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i]; //길이가 저장된 배열 중 가장 큰 값 구하기
            }
        }
        System.out.print(maxLength);
    }
}
