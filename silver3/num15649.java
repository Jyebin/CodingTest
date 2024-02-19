package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num15649 {
    public static int N;
    public static int M;
    public static int[] numbers;
    public static boolean[] visited;
    public static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); //자연수의 끝
        M = Integer.parseInt(input[1]); //수열의 길이
        numbers = new int[N + 1];
        visited = new boolean[N + 1];
        result = new int[M + 1];
        for (int i = 1; i <= N; i++) {
            numbers[i] = i;
            visited[i] = false;
        }
        dfs(1);
        br.close();
    }

    public static void dfs(int depth) {
        if (depth == M + 1) { //깊이가 M인 수열이 완성된 경우
            for (int i = 1; i < M + 1; i++) {
                System.out.print(result[i] + " "); //수열 출력
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = numbers[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
