import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, ArrayList> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String type = clothes[i][1];
            String name = clothes[i][0];
            if(!map.containsKey(type)){
                map.put(type, new ArrayList<>());
            }
            map.get(type).add(name);
        }
        
        int answer = 1;
        for(String key : map.keySet()){
            answer = answer * (map.get(key).size() + 1);
        }
        answer = answer - 1;

        return answer;
    }
}