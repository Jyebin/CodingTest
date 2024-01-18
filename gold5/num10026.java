package gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class num10026 {
    public static int N;
    public static String[][] originPicture;
    public static String[][] deformedPicture;
    public static boolean[][] originVisited;
    public static boolean[][] deformedVisited;
    public static int originCnt;
    public static int deformedCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        if (N < 1 || N > 100) {
            throw new IOException("N의 범위가 잘못되었습니다.");
        }
        originPicture = new String[N][N]; //일반인이 보는 그림
        deformedPicture = new String[N][N]; //적록색약이 보는 그림 -> Red를 Green으로 바꾼 그림
        originVisited = new boolean[N][N];
        deformedVisited = new boolean[N][N];
        originCnt = 0;
        deformedCnt = 0;

        for (int i = 0; i < N; i++) { //그림을 입력받는 부분
            String[] input = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                originPicture[i][j] = input[j];
                deformedPicture[i][j] = input[j];
            }
            for (int j = 0; j < N; j++) {
                if (deformedPicture[i][j].equals("R")) {
                    deformedPicture[i][j] = "G";
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!originVisited[i][j]) {
                    originDfs(i, j);
                    originCnt++;
                }
                if (!deformedVisited[i][j]) {
                    deformedDfs(i, j);
                    deformedCnt++;
                }
            }
        }
        System.out.print(originCnt + " " + deformedCnt);
        br.close();
    }

    public static void originDfs(int x, int y) {
        originVisited[x][y] = true;
        String originCurrent = originPicture[x][y]; //현재 글자
        int[] leftRight = {-1, 0, 1, 0};
        int[] upDown = {0, -1, 0, 1};

        for (int i = 0; i < 4; i++) {
            int newX = x + leftRight[i];
            int newY = y + upDown[i];
            if (newX >= 0 && newY >= 0 && newX < N && newY < N) {
                if (!originVisited[newX][newY] && Objects.equals(originPicture[newX][newY], originCurrent)) {
                    originDfs(newX, newY);
                }
            }
        }
    }

    public static void deformedDfs(int x, int y) {
        deformedVisited[x][y] = true;
        String deformedCurrent = deformedPicture[x][y];
        int[] leftRight = {-1, 0, 1, 0};
        int[] upDown = {0, -1, 0, 1};

        for (int i = 0; i < 4; i++) {
            int newX = x + leftRight[i];
            int newY = y + upDown[i];
            if (newX >= 0 && newY >= 0 && newX < N && newY < N) {
                if (!deformedVisited[newX][newY] && Objects.equals(deformedPicture[newX][newY], deformedCurrent)) {
                    deformedDfs(newX, newY);
                }
            }
        }
    }
}
