import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); //역순 정렬
        int cnt = 0;
        int answer = 0;
        for(int i=0;i<priorities.length;i++){ //배열을 우선순위 큐에 하나씩 넣음
            queue.add(priorities[i]);
        }
        while(!queue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(queue.peek() == priorities[i]){ //큐에서 꺼낸 값과 배열 요소가 같으면
                    queue.poll(); //큐에서 제거
                    cnt ++; //횟수 증가
                    if(i == location){ //만약 현재 값이 알고싶은 값의 위치와 같다면
                        return cnt;
                    }
                }
            }
        }
        return cnt;
    }
}

