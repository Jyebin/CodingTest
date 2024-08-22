import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices); //오름차순 정렬
        StringBuffer sb = new StringBuffer(my_string);
        for(int i=indices.length-1; i>=0; i--){
            //가장 마지막 index부터 지움 -> 전체 길이가 줄어들긴 하지만 for문 범위 안에서는 줄어든 것이 영향을 미치지 못함
            sb = sb.deleteCharAt(indices[i]);
        }
        return sb.toString();
    }
}