import java.util.*;

public class Solution {
    public Object[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int length = arr.length;
        list.add(arr[0]);
        for(int i=0; i<length-1; i++){
            if(arr[i] != arr[i+1]){
                list.add(arr[i+1]);
            }
        }
        Object[] answer = list.toArray();
        return answer;
    }
}
