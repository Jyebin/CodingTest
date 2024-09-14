import java.util.*;

class Solution {
    public ArrayList solution(int[] num_list) {
        //가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 list
        Arrays.sort(num_list);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=5; i<num_list.length; i++){
            list.add(num_list[i]);
        }
        return list;
    }
}