import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array); //정렬
        int answer = array[0]; //맨 처음 요소
        int min = Math.abs(array[0]-n); //절댓값
        
        for(int i=1; i<array.length; i++){
            int next = Math.abs(array[i]-n);
            if(min>next){ //다음 값보다 절댓값이 더 작으면
                min = next; //최소값 update
                answer = array[i]; 
            }else if(min == next){
                if(answer > array[i]){
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}

