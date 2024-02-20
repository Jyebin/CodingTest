package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num15650 {
    public static int N;
    public static int M;
    public static int[] nums;
    public static int[] result;
    public static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); //수열의 끝
        M = Integer.parseInt(input[1]); //수열의 길이
        nums = new int[N + 1];
        result = new int[M + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            nums[i] = i;
            visited[i] = false;
        }
        dfs(1, 1);
        br.close();
    }

    public static void dfs(int depth, int start) {
        if (depth == M + 1) {
            for (int i = 1; i <= M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true; //방문처리
                result[depth] = nums[i];
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}
