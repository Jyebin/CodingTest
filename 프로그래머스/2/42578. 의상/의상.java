import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        //clothes [의상의 이름, 의상의 종류]
        //의상의 이름에서 가짓수를 찾고 의상의 배열에서 가짓수 찾기(?)
        int answer = 0;
        int cnt = 0;
        int result = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            String type = clothes[i][1];
            if(map.containsKey(type)){
                map.put(type, map.get(type)+1);
            }else{
                map.put(type, 1);
            }
        }
        
        String[] key = map.keySet().toArray(new String[0]); //해시맵의 모든 키를 배열에 저장한 후 해당 배열을 사용하여 키를 인덱스로 접근 -> 빈 배열 선언(고정)
        
        for(int i=0; i<key.length; i++){ //종류
            cnt = map.get(key[i]) + 1; //각 종류 별 가능한 가짓수 + 안입는 경우의 수
            result = result * cnt;
        }
        
        answer = result - 1; //아무것도 입지 않는 경우의 수
        return answer;
    }
}