package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num9184 {
    public static int a;
    public static int b;
    public static int c;
    public static int[][][] dp = new int[21][21][21]; //전역변수로 선언해야 메모리 초과가 안남

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            c = Integer.parseInt(input[2]);
            if (a == -1 && b == -1 && c == -1) {
                break;
            }
            int n = w(a, b, c);
            sb.append("w(").append(a).append(", ")
                    .append(b).append(", ").append(c)
                    .append(") = ").append(n).append("\n");
        }
        System.out.print(sb);
        br.close();
    }

    public static int w(int a, int b, int c) {
        if (a >= 0 && b >= 0 && c >= 0 && a <= 20 && b <= 20 && c <= 20 && dp[a][b][c] != 0) {
            return dp[a][b][c];
        } else if (a <= 0 || b <= 0 || c <= 0) {
            return dp[0][0][0] = 1;
        } else if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        } else if (a < b && b < c) {
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else
            return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }
}