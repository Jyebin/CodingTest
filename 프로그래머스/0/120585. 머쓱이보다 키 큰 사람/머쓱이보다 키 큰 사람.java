import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array); //오름차순 정렬
        int idx = -1;
        for(int i=array.length-1; i>=0; i--){ //맨 끝부터 탐색
            if(array[i] <= height){ //작아지는 시점에 탈출
                idx = i;
                break;
            }
        }
        int answer = array.length - idx - 1;
        return answer;
    }
}