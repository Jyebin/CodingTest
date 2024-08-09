import java.util.*;
class Solution {
    public ArrayList solution(int[] num_list) {
        //마지막 원소 > 그전 원소 : 마지막 원소 - 그전 원소
        //마지막 원소 < 그전 원소 : 마지막 원소 * 2
        ArrayList<Integer> arr = new ArrayList<>();
        int length = num_list.length;
        for(int i=0; i<length; i++){
            arr.add(num_list[i]);
        }
        
        if(num_list[length-1] > num_list[length-2]){
            arr.add(num_list[length-1] - num_list[length-2]);
        }else{
            arr.add(num_list[length-1] * 2);
        }

        return arr;
    }
}