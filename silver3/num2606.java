package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2606 {
    public static int computerNum;
    public static int computerPair;
    public static int cnt = 0;
    public static int[][] network;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computerNum = Integer.parseInt(br.readLine()); //컴퓨터의 수
        computerPair = Integer.parseInt(br.readLine()); //직접 연결돼 있는 컴퓨터 쌍의 수
        if (computerNum > 100) {
            throw new IllegalArgumentException("컴퓨터의 수는 100 이하인 양의 정수를 입력해 주세요");
        }
        if (computerPair > (computerNum * (computerNum - 1)) / 2) {
            throw new IllegalArgumentException("가능한 쌍의 개수가 아닙니다");
        }
        network = new int[computerNum + 1][computerNum + 1]; //연결된 컴퓨터(네트워크)를 이중 배열에 담음
        visited = new boolean[computerNum + 1];
        for (int i = 1; i <= computerPair; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            network[a][b] = network[b][a] = 1;
        }
        dfs(1);
        System.out.println(cnt);
        br.close();
    }

    public static void dfs(int start) {
        visited[start] = true; //start노드를 방문 처리

        for (int i = 1; i <= computerNum; i++) {
            if (!visited[i] && network[start][i] == 1) { //방문하지 않은 노드이면서 연결된 노드가 있으면
                cnt++;
                dfs(i);
            }
        }
    }
}
