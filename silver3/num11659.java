package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 사용자에게 입력받음

        int N = Integer.parseInt(st.nextToken()); //줄의 개
        int M = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수
        int[] arr = new int[N + 1]; // 누적합을 저장할 배열. index자리에 i,j가 들어가 계산을 수행
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()); // 새 입력을 받음
        for (int c = 1; c <= N; c++) { // index가 1부터 N까지
            arr[0] = 0;
            arr[c] = arr[c - 1] + Integer.parseInt(st.nextToken());// 이전까지의 합 + 입력받은 것을 쪼갠 것을 기준으로 현재의 값
        }

        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine()); // 새 입력을 받음
            int i = Integer.parseInt(st.nextToken()); // 시작
            int j = Integer.parseInt(st.nextToken()); // 끝
            sb.append(arr[j]-arr[i-1]).append("\n");
        }
        System.out.println(sb);
    }
}
