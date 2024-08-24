import java.util.*;

class Solution {
    public ArrayList solution(int start_num, int end_num) {
        int[] answer = {};
        //start_num에서 end_num까지 1씩 감소하는 수들을 담은 list
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=start_num; i>=end_num; i--){
            list.add(i);
        }
        return list;
    }
}