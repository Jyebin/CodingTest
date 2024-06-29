package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int cnt = 0;
        for (int i = 0; i < N; i++) { //배열의 각 요소를 순회하는 for문
            int num = Integer.parseInt(input[i]);
            boolean isPrime = true;

            for (int j = 2; j <= (int) Math.sqrt(num); j++) { //2부터 그 수의 제곱근까지 나눠보면 소수인지 아닌지 판별 가능
                if (num % j == 0) { //나누어 떨어지는 수가 있으면
                    isPrime = false; //소수가 아님
                    break;
                }
            }
            if(num > 1 && isPrime){ //내부 for문이 다 끝나고 난 후에도 isPrime이 true이면 소수이므로 cnt 증가
                cnt ++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
