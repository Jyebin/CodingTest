import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //연산의 개수
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); //큐에서 역순으로 요소 정. 최대 힙

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            if(x==0){
                if(queue.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(queue.poll()); //가장 큰 값을 제거하고 반환
                }
            }else{
                queue.add(x);
            }
        }
        sc.close();
    }
}
