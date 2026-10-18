import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public long solution(int[] queue1, int[] queue2) {
        //큐에서 하나를 빼서 옆에다 집어넣어 두 개의 합이 같도록 만들것
        //이 때의 최소 횟수가 피룡함
        //일 단 중간값을 구해
        long mid = 0;
        long left = 0;
        long right = 0;
        long answer = 0;
        ArrayDeque<Integer> firstQueue = new ArrayDeque<>();
        ArrayDeque<Integer> secondQueue = new ArrayDeque<>();
        
        for(int i:queue1){
            mid += i;
            left += i;
            firstQueue.offer(i);
        }
        for(int i:queue2){
            mid += i;
            right += i;
            secondQueue.offer(i);
        }
        
        if(mid % 2 != 0){
            return -1;
        }
        mid = mid / 2;
        
        while(left != right){
            if(left < mid){
                //right에서 하나 주기
                int numb = secondQueue.poll();
                answer ++;
                left += numb;
                right -= numb;
                firstQueue.offer(numb);
            }
            if(right < mid){
                int numb = firstQueue.poll();
                answer ++;
                right += numb;
                left -= numb;
                secondQueue.offer(numb);
            }
            
            if(left == right){
                return answer;
            }
            
            if(answer > queue1.length*3){
                return -1;
            }
        }
        return answer;
    }
}