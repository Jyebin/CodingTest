import java.util.*;

class Solution {
    public ArrayList solution(int[] arr) {
        //2가 시작해서 끝날 때 까지
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                list.add(i); //index를 넣음
            }
        }
        
        if(list.size() > 1){
            int start = list.get(0);
            int end = list.get(list.size()-1);
            for(int i=start; i<=end; i++){
                answer.add(arr[i]);
            }
        }else if(list.size()==1){
            answer.add(arr[list.get(0)]);
        }else{
            answer.add(-1);
        }   
        return answer;
    }
}