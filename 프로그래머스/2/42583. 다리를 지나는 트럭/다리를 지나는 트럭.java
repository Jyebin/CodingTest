import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        //주어진 길이만큼 큐를 만들어둬야해서 0을 채우기
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<bridge_length; i++){
            queue.offer(0);
        }
        int answer = 0; //몇 초가 걸리는지 return
        int i=0;
        int totalWei = 0;
        
        while(i<truck_weights.length){
            totalWei -= queue.poll();
            
            if(truck_weights[i] + totalWei <= weight){ //지금꺼랑 다음꺼 합친게 다리 무게보다 작으면
                answer ++;
                queue.offer(truck_weights[i]);
                totalWei += truck_weights[i];
                i++;
            }else{
                answer++;
                queue.offer(0);
            }
        }
        return answer + bridge_length;
    }
}