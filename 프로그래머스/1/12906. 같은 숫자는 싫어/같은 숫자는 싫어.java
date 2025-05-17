import java.util.*;
// 숫자 0부터 9까지 이루어진 배열
// arr에서 연속적으로 나타나는 숫자는 하나만 남기고 제거 -> 제거된 후 반환 시 arr의 순서 유지
public class Solution {
    public ArrayList solution(int []arr) {
        int length = arr.length;
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(arr[0]);
        for(int i=0; i<length-1; i++){
            int now = arr[i];
            if(now != arr[i+1]){ //다음꺼랑 같지 않으면
                queue.add(arr[i+1]);
            }
        }
        
        for(Integer q : queue){
            list.add(q);
        }
       
        return list;
    }
}