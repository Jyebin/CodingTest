import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        //순서를 기억해야 하는 문제이므로 index를 저장
        for(int i=0; i<len; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){ //지금 가격이 직전 가격보다 더 작으면 빼야됨
                int top = stack.pop();
                answer[top] = i - top;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int top = stack.pop();
            answer[top] = len - 1 - top;
        }
        return answer;
    }
}