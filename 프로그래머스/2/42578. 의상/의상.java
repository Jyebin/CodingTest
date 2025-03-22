import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        //각 종류별로 최대 1가지 의상
        //얼굴, 상의, 하의, 겉옷 중 하나만 있어도 ok
        int sum = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            String name = clothes[i][0]; //물건 이름
            String type = clothes[i][1]; //어디에 쓰는 물건인지
            
            if(map.containsKey(type)){
                map.put(type, map.get(type) + 1);
            } else {
                map.put(type, 1);
            }
        }
        
        for(int cnt : map.values()){
            sum *= (cnt + 1);
        }
        answer = sum - 1;
        return answer;
    }
}