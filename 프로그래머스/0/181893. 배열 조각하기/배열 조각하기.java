import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        
        for(int i=0; i<query.length; i++){
            if(i % 2 == 0){
                int idx = query[i]+1;
                for(int j=idx; j<list.size(); j++){
                    list.remove(j);
                    j--;
                }
            } else {
                for(int j=query[i]-1; j>=0; j--){
                    list.remove(j);
                }
            }
        }
        return list;
    }
}
