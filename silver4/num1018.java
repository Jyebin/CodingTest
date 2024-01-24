package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1018 {
    public static int N;
    public static int M;
    public static int minCnt; // 다시 칠해야 하는 정사각형의 개수
    public static String[][] chessBoard;
    public static String[][] originBoardStartW = {
            {"W", "B", "W", "B", "W", "B", "W", "B"},
            {"B", "W", "B", "W", "B", "W", "B", "W"},
            {"W", "B", "W", "B", "W", "B", "W", "B"},
            {"B", "W", "B", "W", "B", "W", "B", "W"},
            {"W", "B", "W", "B", "W", "B", "W", "B"},
            {"B", "W", "B", "W", "B", "W", "B", "W"},
            {"W", "B", "W", "B", "W", "B", "W", "B"},
            {"B", "W", "B", "W", "B", "W", "B", "W"}
    };
    public static String[][] originBoardStartB = {
            {"B", "W", "B", "W", "B", "W", "B", "W"},
            {"W", "B", "W", "B", "W", "B", "W", "B"},
            {"B", "W", "B", "W", "B", "W", "B", "W"},
            {"W", "B", "W", "B", "W", "B", "W", "B"},
            {"B", "W", "B", "W", "B", "W", "B", "W"},
            {"W", "B", "W", "B", "W", "B", "W", "B"},
            {"B", "W", "B", "W", "B", "W", "B", "W"},
            {"W", "B", "W", "B", "W", "B", "W", "B"},
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        M = Integer.parseInt(input[0]);
        if (M < 8 || M > 50) {
            throw new IOException("올바른 범위의 N을 입력해 주세요");
        }
        N = Integer.parseInt(input[1]);
        if (N < 8 || N > 50) {
            throw new IOException("올바른 범위의 M을 입력해 주세요");
        }
        chessBoard = new String[M][N];
        for (int i = 0; i < M; i++) {
            String input2 = br.readLine();
            for (int j = 0; j < N; j++) {
                chessBoard[i][j] = input2.substring(j, j + 1);
            }
        }
        minCnt = Integer.MAX_VALUE;
        for (int i = 0; i <= M - 8; i++) {
            for (int j = 0; j <= N - 8; j++) {
                findCnt(i, j);
            }
        }
        System.out.print(minCnt);
        br.close();
    }

    public static void findCnt(int x, int y) {
        int currentCnt = 0;
        int WCnt = 0;
        int BCnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!originBoardStartW[i][j].equals(chessBoard[x + i][y + j])) {
                    WCnt++;
                }
                if (!originBoardStartB[i][j].equals(chessBoard[x + i][y + j])) {
                    BCnt++;
                }
                currentCnt = Math.min(WCnt, BCnt);
            }
        }
        minCnt = Math.min(minCnt, currentCnt);
    }
}
