import java.util.*;

class Solution {
    public String solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            String now = Character.toString(s.charAt(i));
            if(map.containsKey(now)){
                map.put(now, map.get(now)+1);
            }else{
                map.put(now, 1);
            }
        }
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            String now = Character.toString(s.charAt(i));
            if(map.get(now) == 1){
                list.add(now);
            }
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            answer = answer + list.get(i);
        }
        
        return answer;
    }
}