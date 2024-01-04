package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class num1260 {
    static int N; //전역변수로 선언
    static int M;
    static int V;
    static int[][] line;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); //정점의 개수
        M = Integer.parseInt(input[1]); //간선의 개수
        V = Integer.parseInt(input[2]); //탐색 시작 정점 번호


        line = new int[N + 1][N + 1]; //입력받은 수를 그대로 저장
        visited = new boolean[N + 1];
        for (int i = 0; i < M; i++) { //간선의 개수만큼 반복
            String[] input2 = br.readLine().split(" ");
            int x = Integer.parseInt(input2[0]);
            int y = Integer.parseInt(input2[1]);

            line[x][y] = line[y][x] = 1; //양방향 그래프이기 때문(x에서 y로도 갈 수 있고, y에서 x로도 갈 수 있다는 의미)
        }
        dfs(V);
        visited = new boolean[N + 1]; //dfs에서 사용한 visited 배열이므로 초기화해서 bfs에서 사용할 수 있도록 함
        System.out.println();
        bfs(V);
        br.close();
    }

        public static void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true; //시작 정점을 방문 표시
        System.out.print(start + " ");

        while (!stack.isEmpty()) {
            int current = stack.peek(); //가장 최근에 추가된 데이터 조회(stack의 맨 위 요소 조회. 삭제 X)
            boolean flag = false; //현재 정점에서 이동할 수 있는 정점이 있는지의 여부를 나타냄

            for (int i = 1; i <= N; i++) { //정점의 개수만큼 반복
                if (line[current][i] == 1 && !visited[i]) { //방문하지 않은 요소임과 동시에 간선이 존재하면(위에서 1로 초기화 해 주었음)
                    //현재 요소에 대하여 모든 배열을 순회하며 연결된 간선이 있는지를 확인
                    stack.push(i); //연결된 정점을 stack에 집어넣고
                    System.out.print(i + " "); //현재 요소를 출력한 후
                    visited[i] = true; //방문 처리
                    flag = true; //연결된 정점을 찾았음을 의미
                    break;
                }
            }
            if (!flag) {
                stack.pop(); //연결된 정점이 없으면 stack에서 삭제
            }
        }
    }


    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>(); //큐는 linkedlist로 구현
        queue.offer(start);
        visited[start] = true; //첫 번째 요소 방문 처리
        //어차피 큐라서 start가 먼저 출력됨

        while (!queue.isEmpty()) {
            int current = queue.poll(); //큐의 맨 처음 요소를 꺼낸 후 삭제
            System.out.print(current + " "); //현재 요소를 출력

            for (int i = 1; i <= N; i++) { //정점의 개수만큼 반복
                if (!visited[i] && line[current][i] == 1) { //방문하지 않은 요소이고 간선이 존재하면
                    queue.offer(i); //연결된 정점을 큐에 추가하고
                    visited[i] = true; //방문 표시
                }
            }
        }
    }
}

