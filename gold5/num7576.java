package gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class num7576 {
    public static int M;
    public static int N;
    public static int cnt;
    public static boolean visited[][];
    public static int[][] whereTomato;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputMnN = br.readLine().split(" ");
        M = Integer.parseInt(inputMnN[0]); //상자의 가로 칸 수
        N = Integer.parseInt(inputMnN[1]); //상자의 세로 칸 수
        whereTomato = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] inputTomato = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                whereTomato[i][j] = Integer.parseInt(inputTomato[j]);
            }
        }
        int result = bfs();
        System.out.print(result);
        br.close();
    }

    public static int bfs() {
        visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();
        int[] leftRignt = {1, 0, -1, 0};
        int[] upDown = {0, 1, 0, -1};

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (whereTomato[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        int days = 0;
        while (!queue.isEmpty()) {
            int size = queue.size(); //현재 큐에 들어있는 토마토의 개수 -> 같은 날짜에 익은 토마토

            for (int k = 0; k < size; k++) { //같은 날짜에 익은 모든 토마토에 대해 처리
                int[] current = queue.poll();
                int currentX = current[0];
                int currentY = current[1];

                for (int i = 0; i < 4; i++) { //상하좌우 인접한 위치 확인
                    int newX = currentX + leftRignt[i];
                    int newY = currentY + upDown[i];

                    //방문하지 않고, 익지 않은 토마토의 경우 익히고 방문 처리
                    if (newX >= 0 && newY >= 0 && newX < N && newY < M && !visited[newX][newY] && whereTomato[newX][newY] == 0) {
                        visited[newX][newY] = true;
                        whereTomato[newX][newY] = 1;
                        queue.add(new int[]{newX, newY});
                    }
                }
            }
            days++; //익혔으니 하루가 지남
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (whereTomato[i][j] == 0) {
                    return -1;
                }
            }
        }
        return days - 1; //익히고 하루가 지난 상태이므로, 최종 답에서 1을 빼 주어야 함
    }
}
