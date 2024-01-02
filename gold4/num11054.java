package gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        int[] increaseDp = new int[N]; //증가하는 바이토닉 수의 개수를 저장할 배열
        int[] decreaseDp = new int[N]; //감소하는 바이토닉 수의 개수를 저장할 배열
        for (int i = 0; i < N; i++) {
            increaseDp[i] = 1; //처음에는 가장 긴 수열의 개수가 1이기 때문에 초기화
            for (int j = 0; j < i; j++) { //i번째 수 이전까지 한번 더 살피기
                if (A[j] < A[i] && increaseDp[i] < increaseDp[j] + 1) { //현재 숫자가 이전 숫자보다 더 크고 추가했을 때의 길이가 더 길다면
                    increaseDp[i] = increaseDp[j] + 1;
                }
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            decreaseDp[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (A[j] < A[i] && decreaseDp[i] < decreaseDp[j] + 1) {
                    decreaseDp[i] = decreaseDp[j] + 1;
                }
            }
        }
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            int length = increaseDp[i] + decreaseDp[i] - 1; // 중복되는 i를 빼주어야 함(주어진 수열에서의 최대값)
            maxLength = Math.max(maxLength, length);
        }
        System.out.println(maxLength);
    }
}