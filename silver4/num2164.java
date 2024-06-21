package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class num2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //카드의 장수
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i); //작은 수부터 큐에 들어가도록
        }
        while(queue.size() > 1){
            if(queue.size() == 1){
                break;
            }
            //맨 위의 카드를 버림(첫 번째 요소)
            queue.poll();
            //맨 위의 카드를 맨 아래에 넣음(마지막 요소)
            queue.add(queue.poll());
        }
        //마지막 남은 카드 출력
        System.out.println(queue.peek());
        br.close();
    }
}
