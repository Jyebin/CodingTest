import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        //주식 가격의 index를 먼저 stack에 더하고 조건이 맞으면 그부분의 답을 구하고 stack에서 제외
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<len; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
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