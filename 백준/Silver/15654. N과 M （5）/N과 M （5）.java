
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int N;
    public static int M;
    public static boolean[] visited; //방문 여부를 저장할 배열
    public static int[] result; //순열을 저장할 배열
    public static int[] inputArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        String[] input2 = br.readLine().split(" ");
        inputArr = new int[N];
        visited = new boolean[N];
        result = new int[M];

        for (int i = 0; i < N; i++) {
            inputArr[i] = Integer.parseInt(input2[i]);
        }
        Arrays.sort(inputArr); //오름차순 정렬
        dfs(0);
        br.close();
    }

    public static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = inputArr[i];
                dfs(depth + 1);
                visited[i] = false;
            }

        }
    }
}
