package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class num2178 {
    public static int N;
    public static int M;
    public static int[][] maze; //미로
    public static boolean[][] visited; //방문 여부를 저장할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        if (N < 2 || N > 100 || M < 2 || M > 100) {
            throw new IllegalArgumentException("N과 M의 범위가 잘못되었습니다.");
        }
        maze = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String[] lines = br.readLine().split(""); //한줄씩 입력받고 문자별로 구분
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(lines[j]); //j랑 lines의 index 맞춰주기
                visited[i][j] = false; //전체 칸을 방문하지 않았다고 초기화
            }
        }
        bfs(0, 0); //1,1에서 출발
        visited[0][0] = true;//출발지 방문처리
        System.out.print(maze[N - 1][M - 1]);
        br.close();
    }

    public static void bfs(int x, int y) { //최단 거리를 계산해야 하니까 bfs를 사용
        Queue<int[]> queue = new LinkedList<>(); //큐에 배열을 저장(행과 열 저장)
        int[] leftRight = {1, 0, -1, 0}; //좌우
        int[] upDown = {0, 1, 0, -1}; //상하
        queue.add(new int[]{x, y}); //시작 좌료플 큐에 넣음
        visited[x][y] = true; //방문처리

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); //현재 좌표 값을 큐에서 갖고옴
            int X = current[0]; //현재 x좌표
            int Y = current[1]; //현재 y좌표

            for (int i = 0; i < 4; i++) { //상하좌우
                int newX = X + leftRight[i]; //x좌표의 상하좌우값
                int newY = Y + upDown[i]; //y좌표의 상하좌우값

                if (newX >= 0 && newX < N && newY >= 0 && newY < M
                        && maze[newX][newY] == 1 && !visited[newX][newY]) {
                    queue.add(new int[]{newX, newY});
                    visited[newX][newY] = true;
                    maze[newX][newY] = maze[X][Y] + 1; //최단 거리 갱신
                }
            }
        }
    }
}
