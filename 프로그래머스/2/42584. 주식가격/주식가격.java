import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];

        for(int i=0; i<length; i++){
            int now = prices[i]; // 비교 대상 값
            Stack<Integer> stack = new Stack<>();
            for(int j=i+1; j<length; j++){ // 현재 값 이후의 값들 비교
                stack.push(prices[j]); //일단 스택에 넣음
                if(now > prices[j]){ // 현재 가격이 이후 가격보다 크면 멈춤
                    break;
                }
            }
            answer[i] = stack.size();
        }
        return answer;
    }
}
