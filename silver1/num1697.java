package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class num1697 {
    public static int N;
    public static int K;
    public static int[] cnt = new int[100001]; //index 값에 위치를 저장하고, arr값에 해당 위치까지 이동한 횟수를 저장

    //자바에서는 배열을 선언하면 안의 값들이 0으로 초기화돼서 선언됨
    public static void main(String[] args) throws IOException { //최단 경로를 구하는 것이기 때문에 dfs로 풀어야 함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); //수빈이가 있는 위치
        K = Integer.parseInt(input[1]); //동생이 있는 위치
        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N); //N일 때 시작
        }
        br.close();
    }

    public static void bfs(int start) { //start : 시작좌표
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        cnt[start] += 1; //방문했으니 횟수 1 증가

        while (!queue.isEmpty()) {
            int currentIdx = queue.poll(); //현재 index값
            for (int i = 0; i < 3; i++) { //'뒤로 한 칸, 앞으로 한 칸, 순간이동' 총 3가지 경우가 있으므로 모두 따져줘야 함
                int nextIdx = 0;
                if (i == 0) { //앞으로 한 칸 걷는 경우
                    nextIdx = currentIdx + 1;
                } else if (i == 1) { //뒤로 한 칸 걷는 경우
                    nextIdx = currentIdx - 1;
                } else { //순간이동을 하는 경우
                    nextIdx = currentIdx * 2;
                }

                if (nextIdx == K) { //목표 지점에 도달했으면
                    System.out.println(cnt[currentIdx]); //목표 지점에서의 이동 횟수를 출력
                    return;
                }

                if (nextIdx >= 0 && nextIdx < cnt.length && cnt[nextIdx] == 0) { //다음 위치가 양수이고, 인덱스 범위 내에 있으며 방문하지 않은 지점이면
                    queue.add(nextIdx); //큐에 추가
                    cnt[nextIdx] = cnt[currentIdx] + 1; //다음 위치에서의 이동 횟수는 현재 위치에서의 이동 횟수 +1임
                }
            }
        }
    }
}