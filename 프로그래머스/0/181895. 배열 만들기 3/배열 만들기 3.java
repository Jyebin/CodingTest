import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        //닫힌 구간 : 양 끝값과 그 사이의 값을 모두 포함하는 구간
        for(int i=0; i<intervals.length; i++){
            for(int j=0; j<intervals[i].length; j++){
                int start = intervals[i][0];
                int end = intervals[i][1];
                for(int k=start; k<=end; k++){
                    list.add(arr[k]);
                }
                break;
            }
        }
        return list;
    }
}