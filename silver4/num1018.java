import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class num1018 {
    public static int N;
    public static int M;
    public static int cnt = 0; // 다시 칠해야 하는 정사각형의 개수
    public static boolean[][] visited;
    public static String[][] chessBoard;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        if (N < 8 || N > 50) {
            throw new IOException("올바른 범위의 N을 입력해 주세요");
        }
        M = Integer.parseInt(input[1]);
        if (M < 8 || M > 50) {
            throw new IOException("올바른 범위의 M을 입력해 주세요");
        }
        visited = new boolean[M][N];
        chessBoard = new String[M][N];
        for (int i = 0; i < N; i++) {
            String[] input2 = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                chessBoard[i][j] = input2[j];
            }
        }
        bfs(0, 0);
        System.out.print(cnt);
        br.close();
    }

    public static void bfs(int x, int y) { // 큐 사용
        visited[x][y] = true;
        String currentColor = chessBoard[x][y];
        Queue<int[]> queue = new LinkedList<>();
        int[] leftRight = {-1, 0, 1, 0};
        int[] upDown = {0, 1, 0, -1};
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];

            for (int i = 0; i < 4; i++) {
                int newX = currentX + leftRight[i];
                int newY = currentY + upDown[i];
                if (newX >= 0 && newY >= 0 && newX < M && newY < N && !visited[newX][newY] && currentColor.equals(chessBoard[newX][newY])) {
                    if (currentColor.equals("B")) {
                        chessBoard[newX][newY] = "W";
                    } else {
                        chessBoard[newX][newY] = "B";
                    }
                    visited[newX][newY] = true;
                    cnt++;
                    queue.add(new int[]{newX, newY});
                }
            }
        }
    }
}
