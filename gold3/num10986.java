package gold3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //입력받음
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); //나누어 떨어지게 하는 수
        long count = 0;
        long[] sum = new long[N + 1]; //누적 합
        long[] division = new long[M]; //나머지(만약 M이 3이면 나머지는 0,1,2만 나올 수 있음)
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sum[i] += (sum[i - 1] + Integer.parseInt(st.nextToken())) % M;
            if (sum[i] == 0) {
                count++;
            }
            division[(int) sum[i]]++;
        }
        for (int i = 0; i < M; i++) {
            if (division[i] > 1) {
                count += (division[i] * (division[i] - 1) / 2);
            }
        }
        System.out.println(count);
    }
}