import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        //s<=i<=e, arr[i]가 가장 작은 것. 단 k보다 커야 함
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int j=s; j<=e; j++){
                if(arr[j] > k){
                    System.out.println("원본 배열" + arr[j]);
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
                for(int a=0; a<list.size(); a++){
                    System.out.print("여기부터야 ");
                    System.out.println(list.get(a));
                }
            }
        }
        
        return answer;
    }
}