import java.util.*;

class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        //정렬을 이용하면 index 번호가 변경됨
        if(arr.length == 1){ //하나를 뺐으니까 빈 배열일 것
            list.add(-1);
        } else {
            int min = Integer.MAX_VALUE;
            for(int i=0; i<arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
                }
            }

            for(int i=0; i<arr.length; i++){
                if(min != arr[i]){
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
}