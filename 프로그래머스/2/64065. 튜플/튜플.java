import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public ArrayList solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] str = s.split(",");
        
        for(int i=0; i<str.length; i++){
            str[i] = str[i].replace("{","").replace("}","");
        }
        
        for(String st : str){
            String now = st + "";
            map.put(now, map.getOrDefault(now, 0) + 1);
        }
        
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b) -> map.get(b) - map.get(a)); //키를 정렬할건데, value를 기준으로 정렬할것
        ArrayList<Integer> result = new ArrayList<>();
        
        for(String key : keys){
            result.add(Integer.parseInt(key));
        }
        return result;
    }
}