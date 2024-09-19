
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int inputNum = Integer.parseInt(br.readLine());
        int num = 1; // 시작 수
        int[][] arr = new int[N][N];
        int x = 0;
        int y = 0;

        int rowStart = N / 2;
        int colStart = N / 2;

        arr[rowStart][colStart] = num++;
        if (arr[rowStart][colStart] == inputNum) {
            x = N / 2;
            y = N / 2;
        }
        int steps = 1; // 나선의 초기 크기

        while (num <= N * N) {
            for (int i = 0; i < steps; i++) {
                if (num > N * N) {
                    break;
                }
                rowStart--; //위로
                arr[rowStart][colStart] = num++;
                if (arr[rowStart][colStart] == inputNum) {
                    x = rowStart;
                    y = colStart;
                }
            }

            for (int i = 0; i < steps; i++) {
                if (num > N * N) {
                    break;
                }
                colStart++; //오른쪽으로
                arr[rowStart][colStart] = num++;
                if (arr[rowStart][colStart] == inputNum) {
                    x = rowStart;
                    y = colStart;
                }
            }
            steps++;

            for (int i = 0; i < steps; i++) {
                if (num > N * N) {
                    break;
                }
                rowStart++; //아래로
                arr[rowStart][colStart] = num++;
                if (arr[rowStart][colStart] == inputNum) {
                    x = rowStart;
                    y = colStart;
                }
            }

            for (int i = 0; i < steps; i++) {
                if (num > N * N) {
                    break;
                }
                colStart--; //왼쪽으로
                arr[rowStart][colStart] = num++;
                if (arr[rowStart][colStart] == inputNum) {
                    x = rowStart;
                    y = colStart;
                }
            }
            steps++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println((x + 1) + " " + (y + 1));
    }
}
