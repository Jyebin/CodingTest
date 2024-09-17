import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length; //행 -> 가로줄
        int coll = arr[0].length; //열 -> 안의 각각 요소
        int size = Math.max(rows, coll); //둘 중 더 큰 사이즈 찾기
        int[][] answer = new int[size][size];
        for(int i=0; i<size; i++){
            //각 요소를 복사해서 넣기
            if(i < rows){
                answer[i] = Arrays.copyOf(arr[i], size);
            }else{
                Arrays.fill(answer[i], 0);
            }
        }
        return answer;
    }
}