package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input);

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (i <= 99) { //1~99까지는 무조건 한수
                cnt++;
            } else if (i <= 999) { //세자리 수에서는 조건 비교. 1000은 한수가 아님
                String[] nowI = String.valueOf(i).split("");
                int[] arr = new int[3]; //각 자리 숫자를 저장할 곳
                for (int j = 0; j < 3; j++) {
                    arr[j] = Integer.parseInt(nowI[j]);
                }
                if ((arr[2] - arr[1]) == (arr[1] - arr[0])) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
        br.close();
    }
}
