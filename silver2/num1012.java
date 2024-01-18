package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1012 {
    public static int T; //테스트 케이스의 개수
    public static int M;
    public static int N;
    public static int K;
    public static int[][] field; //배추밭
    public static boolean[][] visited; //방문 여부 표시
    public static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]); //가로길이
            N = Integer.parseInt(input[1]); //세로길이
            K = Integer.parseInt(input[2]); //배추가 심어져 있는 위치의 개수
            field = new int[M][N];
            visited = new boolean[M][N];
            cnt = 0;
            for (int j = 0; j < K; j++) {
                String[] input2 = br.readLine().split(" ");
                int X = Integer.parseInt(input2[0]);
                int Y = Integer.parseInt(input2[1]);
                field[X][Y] = 1; //입력받은 위치에 1 추가
            }

            for (int a = 0; a < M; a++) {
                for (int b = 0; b < N; b++) {
                    if (!visited[a][b] && field[a][b] == 1) { //방문하지 않았고, 배추가 심어져 있으면
                        dfs(a, b);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
        br.close();
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        int[] leftRight = {-1, 0, 1, 0};
        int[] upDown = {0, -1, 0, 1};
        for (int i = 0; i < 4; i++) {
            int currentX = x + leftRight[i];
            int currentY = y + upDown[i];

            if (currentX >= 0 && currentY >= 0 && currentX < M && currentY < N && !visited[currentX][currentY] && field[currentX][currentY] == 1) {
                dfs(currentX, currentY);
            }
        }
    }
}
