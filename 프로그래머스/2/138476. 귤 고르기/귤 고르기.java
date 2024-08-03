import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        //k : 상자에 담으려는 귤의 개수
        //tangerine : 귤의 크기
        //귤의 다른 종류의 수
        //우선 HashMap에 저장한 후 큰 순서대로 get
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            if(!map.containsKey(tangerine[i])){
                map.put(tangerine[i], 1);
            }else{
                map.put(tangerine[i], map.get(tangerine[i])+1);
            }
        }
                
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
                return o2.getValue() - o1.getValue();
            }
        });
        
        int sum = 0;
        int answer = 0;
        for(int i=0; i<list.size(); i++){
            if(sum >= k){
                break;
            }
            answer ++;
            sum = sum + list.get(i).getValue();
        }
        return answer;
    }
}