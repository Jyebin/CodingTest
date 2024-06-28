package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        //적어도 대부분의 배수 : 적어도 세 개로 나누어 지는 가장 작은 자연수
        //주어지는 다섯 개의 자연수 모두 100보다 작으므로 1씩 증가시켜서 모든 수를 따져도 괜찮음
        int length = input.length;
        int min = 1;
        while (true) {
            int cnt = 0;
            for (int i = 0; i < length; i++) {
                if (min % Integer.parseInt(input[i]) == 0) { //나누어 떨어지는 수이면
                    //적어도 3개만 있으면 되므로 하나하나의 요소를 검사해주면 됨
                    cnt++;
                    if (cnt == 3) {
                        break;
                    }
                }
            }
            if (cnt == 3) {
                break;
            }
            min++;
        }
        System.out.println(min);
        br.close();
    }
}
