import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                arr[i] = -1;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != -1){
                list.add(arr[i]);
            }
        }
        return list;
    }
}