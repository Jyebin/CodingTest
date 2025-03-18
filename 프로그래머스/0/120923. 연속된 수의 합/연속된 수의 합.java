import java.util.*;

class Solution {
    public ArrayList solution(int num, int total) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        //연속된 수 num개를 더한 값이 total
        //슬라이딩 윈도우
        
        int mid = total / num; // 이게 중심값
        if(num % 2 == 1){
            answer.add(mid);
            for(int i=1; i<=num/2; i++){
                answer.add(mid + i);
                answer.add(mid - i);
            }
        } else {
            for (int i = 1 - (num / 2); i <= num / 2; i++) {
                answer.add(mid + i);
            }
        }

        Collections.sort(answer);
        
        return answer;
    }
}