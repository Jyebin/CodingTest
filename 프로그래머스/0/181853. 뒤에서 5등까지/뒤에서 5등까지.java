import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        //가장 작은 5개의 수 오름차순
        Arrays.sort(num_list);
        int[] answer = new int[5];
        for(int i=0; i<5; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}