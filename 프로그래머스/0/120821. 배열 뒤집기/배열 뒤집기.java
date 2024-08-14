import java.util.*;
class Solution {
    public ArrayList solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=num_list.length-1; i>=0; i--){
            list.add(num_list[i]);
        }
        return list;
    }
}