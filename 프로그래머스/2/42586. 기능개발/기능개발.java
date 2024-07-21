import java.util.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        //새로운 큐에 개발 속도를 update해서 저장
        //개발 완료 일 = (100-progresses[i]) / speeds[i]
        int length = progresses.length;
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<length;i++){
             int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.add(days);
        }
        while(!queue.isEmpty()){ //큐가 차 있을 때
            int cnt = 1; //맨 앞에 꺼는 배포가 가능
            int first = queue.poll(); //맨 앞 데이터 꺼내기
            while(!queue.isEmpty() && first >= queue.peek()){ //꺼낸 데이터보다 큐의 맨 앞 데이터가 작거나 같으면 계속 꺼내기
                queue.poll(); //큐에서 요소를 꺼냄
                cnt++;
            }
            list.add(cnt); //배열에 넣어줌
        }
        return list;
    }
}