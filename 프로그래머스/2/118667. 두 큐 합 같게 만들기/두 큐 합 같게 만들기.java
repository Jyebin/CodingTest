import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long left = 0;
        long right = 0;
        int len = queue1.length;
        long sum = 0;
        
        ArrayDeque<Integer> leftQueue = new ArrayDeque<>();
        ArrayDeque<Integer> rightQueue = new ArrayDeque<>();
        
        for(int i:queue1){
            left += i; //왼쪽꺼 총합
            sum += i; //두개 전체 총합
            leftQueue.offer(i);
        }
        for(int i:queue2){
            right += i;
            sum += i;
            rightQueue.offer(i);
        }
        
        if(sum % 2 != 0){ //짝수가 아니면 애초에 같아질 수 없음
            return -1;
        }
        sum = sum / 2;
        
        while(right != left){ //양쪽이 다른 동안
            if(left < sum){ //왼쪽이 더 작으면
                answer ++;
                //오른쪽에서 왼쪽에 넣어아햠
                int num = rightQueue.poll();
                leftQueue.offer(num);
                left += num;
                right -= num;
            }
            if(right < sum){
                answer ++;
                int num = leftQueue.poll();
                rightQueue.offer(num);
                right += num;
                left -= num;
            }
            
            if(right == left){
                return answer;
            }
            if(answer > len*3){
                return -1;
            }
        }
        
        return answer;
    }
}