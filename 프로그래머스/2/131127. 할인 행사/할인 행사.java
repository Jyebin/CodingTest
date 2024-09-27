import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String,Integer> wantList = new HashMap();
        
        for(int i=0; i<want.length;i++){
            wantList.put(want[i],number[i]);
        }
        
       for(int i =0; i<=discount.length-10;i++){
           Map<String,Integer> map = new HashMap();
           for(int j=i; j<i+10; j++){
               if(wantList.containsKey(discount[j])){
                    map.put(discount[j], map.getOrDefault(discount[j],0)+1);
                }else{
                   continue;
               }
           }
           boolean check = true;
            for(String s : wantList.keySet()){
                if(!map.containsKey(s) || map.get(s) < wantList.get(s)){
                    check = false;
                    break;
                }
            }
            if(check){
                answer++;
            }
           
       }
        
        return answer;
    }
}