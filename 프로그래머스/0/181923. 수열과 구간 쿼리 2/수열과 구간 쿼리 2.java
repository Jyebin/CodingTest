import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[][] queries) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        //s<=i<=e, arr[i]가 가장 작은 것. 단 k보다 커야 함
        for(int i=0; i<queries.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int j=s; j<=e; j++){
                if(arr[j] > k){
                    list.add(arr[j]); //우선 list에 저장
                }
            }
            
            if(list.isEmpty()){
                answer.add(-1);
            } else {
                //저장된 것 정렬
                Collections.sort(list);
                //이 중 가장 작은 것을 반환
                answer.add(list.get(0));
            }
        }
        
        return answer;
    }
}