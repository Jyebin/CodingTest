import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        //응급도가 높은 순서대로 진료 순서를 정한 배열 return
        //배열 안의 숫자가 클수록 응급도가 높은 것
        //자기보다 더 큰 숫자가 있으면 cnt++;
        int length = emergency.length;
        int[] answer = new int[length];
        for(int i=0; i<length; i++){
            answer[i] = 1;
        }
        int now = 0;
        for(int i=0; i<length; i++){
            now = emergency[i]; //현재값
            for(int j=0; j<length; j++){
                if(now < emergency[j]){
                    answer[i]++;
                }
            }
            
        }
        
        return answer;
    }
}