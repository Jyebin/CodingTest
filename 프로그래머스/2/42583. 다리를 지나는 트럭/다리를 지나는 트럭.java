import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int length = truck_weights.length;
        int sum = 0; //다리 위에 올라간 트럭의 전체 무게
        int time = 0; //걸린 시간 -> 트럭이 다리 위에 올라간 경우에만 증가시켜야함
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<length; i++){
            int now = truck_weights[i]; //현재 트럭
            while(true){
                if(queue.isEmpty()){ //다리가 빈 경우 -> 아무거나 올라갈 수 있음
                    queue.add(now);
                    sum = sum + now; //트럭의 무게 추가
                    time++;
                    break;
                }else if(queue.size() == bridge_length){ //길이가 꽉 찬 경우
                    int now2 = queue.poll(); //맨 위에서 제거
                    sum = sum - now2; //무게 제거
                }else{ //길이가 남은 경우
                    if(now + sum <= weight){ //무게가 가능하면
                        queue.add(now);
                        sum = sum + now;
                        time++;  
                        break;
                    }else{
                        queue.add(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}