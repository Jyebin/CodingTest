import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i] == true){
                list.add(new int[]{rank[i],i});
            }
        }
        Collections.sort(list, Comparator.comparingInt(a -> a[0])); //배열의 첫 번째 요소를 기준으로 비교
        //a라는 배열을 받아서 그 배열의 첫 번째 요소 반환
        answer = 10000 * list.get(0)[1] + 100 * list.get(1)[1] + list.get(2)[1];
        return answer;
    }
}