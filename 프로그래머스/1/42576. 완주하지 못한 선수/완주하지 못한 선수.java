import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //참여 선수 명단에서 완주한 선수 빼기
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<participant.length; i++){
            if(map.containsKey(participant[i])){
                map.put(participant[i], map.get(participant[i]) + 1);
            } else {
                map.put(participant[i], 1);
            }
        }
        
        for(int i=0; i<completion.length; i++){
            if(map.get(completion[i]) >= 0){
                map.put(completion[i], map.get(completion[i]) - 1);
            }
        }
        
        String answer = "";
        
        for(int i=0; i<participant.length; i++){
            if(map.get(participant[i]) != 0){
                answer = participant[i];
            }
        }
        
        return answer;
    }
}