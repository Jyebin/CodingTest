package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class num2667 {
    public static int N;
    public static int[][] whereHome;
    public static boolean[][] visited;
    public static int homeNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        whereHome = new int[N][N]; //집의 위치
        visited = new boolean[N][N]; //방문 여부
        homeNum = 0;

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < input.length; j++) {
                whereHome[i][j] = Integer.parseInt(input[j]);
                visited[i][j] = false;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (whereHome[i][j] == 1 && !visited[i][j]) { //집이 있거나 방문한 적이 없으면
                    result.add(bfs(i, j)); //bfs값을 더해줌
                    homeNum++; //단지 수를 증가시켜서 다른 단지값을 저장할 수 있도록 함
                }
            }
        }
        System.out.println(homeNum); //단지 수 출력

        Collections.sort(result); //각 단지의 집의 수 정렬
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i)); //출력
        }
        br.close();
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        int[] leftRight = {1, 0, -1, 0};
        int[] upDown = {0, 1, 0, -1};
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            count++;

            for (int i = 0; i < 4; i++) {
                int newX = currentX + leftRight[i];
                int newY = currentY + upDown[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < N) {
                    if (whereHome[newX][newY] == 1 && !visited[newX][newY]) {
                        queue.add(new int[]{newX, newY});
                        visited[newX][newY] = true;
                    }
                }
            }
        }
        return count;
    }
}
