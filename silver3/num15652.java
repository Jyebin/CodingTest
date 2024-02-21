package silver3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num15652 {
    public static int N;
    public static int M;
    public static int[] result;
    public static boolean visited[];
    public static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); //수열의 끝
        M = Integer.parseInt(input[1]); //수열의 길이
        result = new int[M];
        visited = new boolean[N + 1];
        dfs(0, 1);
        System.out.println(sb.toString());
        br.close();
    }

    public static void dfs(int depth, int start) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i <= N; i++) { //start부터 시작하도록 함
            result[depth] = i;
            dfs(depth + 1, i);
        }
    }
}
