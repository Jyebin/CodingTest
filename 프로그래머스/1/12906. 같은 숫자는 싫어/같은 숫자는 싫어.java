import java.util.*;

public class Solution {
    public ArrayList solution(int []arr) {
        int[] answer = {};
        //arr에서 연속적으로 나타나는 숫자 제거
        //제거된 후 남은 수들 반환 시 arr 원소들 순서 유지
        ArrayList<Integer> list = new ArrayList<>();
       
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                list.add(arr[i]);
            }    
        }
        list.add(arr[arr.length-1]);
        return list;
    }
}