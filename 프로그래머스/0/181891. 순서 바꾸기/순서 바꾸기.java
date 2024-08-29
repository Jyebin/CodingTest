import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        //n을 기준으로 배열을 두 개로 나눔
        //두 개의 위치를 바꿈
        ArrayList<Integer> front = new ArrayList<>();
        ArrayList<Integer> back = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            front.add(num_list[i]);    
        }
        for(int i=n; i<num_list.length; i++){
            back.add(num_list[i]);
        }
        int[] answer = new int[front.size() + back.size()];
        for(int i=0; i<back.size(); i++){
            answer[i] = back.get(i);
        }
        for(int i=0; i<front.size(); i++){
            answer[i + back.size()] = front.get(i);
        }
        return answer;
    }
}