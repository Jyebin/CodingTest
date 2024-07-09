import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];
        
        for(int i=0; i<length-1; i++){
            int current = prices[i]; //현재 값
            int cnt = 0;
            for(int j=i+1; j<length; j++){ //현재값 이후의 값들만 저장
                cnt++;
                if(current > prices[j]){ //현재 값이 이후 값보다 더 크면
                    break;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}