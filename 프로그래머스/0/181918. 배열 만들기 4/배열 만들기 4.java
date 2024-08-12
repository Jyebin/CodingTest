import java.util.*;

class Solution {
    public Stack solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i=0;
        int len = arr.length;
        while(i<len){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else{ //원소가 있으면
                if(stk.peek() < arr[i]){ //stk의 마지막 원소가 더 작으면
                    stk.add(arr[i]);
                    i++;
                }else{ //마지막 원소가 크거나 같으면
                    stk.pop();
                }
            }
        }
        return stk;
    }
}