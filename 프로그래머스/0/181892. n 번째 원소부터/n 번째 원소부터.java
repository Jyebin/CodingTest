import java.util.*;

class Solution {
    public ArrayList solution(int[] num_list, int n) {
        //n번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트 return
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=n-1; i<num_list.length; i++){
            list.add(num_list[i]);
        }
        return list;
    }
}