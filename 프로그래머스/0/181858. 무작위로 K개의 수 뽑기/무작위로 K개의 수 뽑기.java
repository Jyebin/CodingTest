import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[j] = -1;
                }
            }
        }    
        for(int i=0; i<arr.length; i++){
            if(arr[i] != -1){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[k];
        int len = list.size();
        if(len < k){
            for(int i=0; i<k; i++){
                answer[i] = -1;
            }
            for(int i=0; i<len; i++){
                answer[i] = list.get(i);
            }
        }else{
            for(int i=0; i<k; i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}