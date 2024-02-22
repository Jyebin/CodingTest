package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num14888 {
    public static int N;
    public static int maxValue = Integer.MIN_VALUE; //가장 큰 값을 가장 작은 값으로 초기화;
    public static int minValue = Integer.MAX_VALUE;
    public static int[] sequence;
    public static int[] operator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String input1[] = br.readLine().split(" ");
        sequence = new int[N];
        for (int i = 0; i < N; i++) { //N개의 수로 이루어진 수열
            sequence[i] = Integer.parseInt(input1[i]);
        }
        String input2[] = br.readLine().split(" ");
        operator = new int[4]; //0:+,1:-,2:*,3:/
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(input2[i]);
        }
        dfs(sequence[0],1 ); //맨 처음 숫자부터 진행

        System.out.println(maxValue);
        System.out.println(minValue);
        br.close();
    }

    public static void dfs(int num, int idx) {
        if (idx == N) {
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
            return; //즉시 함수를 종료하고 값을 반환
        }
        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) { //연산자의 개수가 존재하는 경우
                operator[i]--; //해당 연산자의 개수를 1 감소시킴

                if (i == 0) { //+방일 경우 계산하고 이후의 단계 호출
                    dfs(num + sequence[idx], idx + 1);
                } else if (i == 1) {
                    dfs(num - sequence[idx], idx + 1);
                } else if (i == 2) {
                    dfs(num * sequence[idx], idx + 1);
                } else {
                    dfs(num / sequence[idx], idx + 1);
                }
                operator[i]++; //연산자의 개수를 복구해서 다음 로직이 실행될 수 있도록 함
            }
        }
    }
}
