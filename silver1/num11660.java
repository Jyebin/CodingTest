package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]); //표의 크기
        int M = Integer.parseInt(inputNM[1]); //합을 구해야 하는 횟수
        int[][] table = new int[N + 1][N + 1]; //표. [x][y]는 (x,y)를 의미
        int[][] sum = new int[N + 1][N + 1]; //누적합을 저장할 배열

        for (int i = 1; i <= N; i++) { //표를 입력받음
            String[] input = br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                table[i][j] = Integer.parseInt(input[j - 1]);
                sum[i][j] = table[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }
        for (int i = 0; i < M; i++) {
            String[] inputXY = br.readLine().split(" ");
            int startX = Integer.parseInt(inputXY[0]);
            int startY = Integer.parseInt(inputXY[1]);
            int endX = Integer.parseInt(inputXY[2]);
            int endY = Integer.parseInt(inputXY[3]);

            int result = sum[endX][endY] - sum[endX][startY - 1] - sum[startX - 1][endY] + sum[startX - 1][startY - 1];
            System.out.println(result);
        }
        br.close();
    }
}
