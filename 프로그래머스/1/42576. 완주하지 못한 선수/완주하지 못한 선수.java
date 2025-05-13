import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //participant : 참여 선수
        //completion : 완주한 선수
        //완주하지 못한 선수 return
        //hashmap을 통해 key값을 선수 이름으로 하고, value값을 숫자로 해서 완주한 경우에는 -1 빼기
        //최종적으로 hashmap을 순회해서 return해주기
        HashMap<String, Integer> map = new HashMap<>();
        int length = participant.length;
        for(int i=0; i<length; i++){
            //참여 선수 전부를 순회해서 hashmap에 등록
            if(map.containsKey(participant[i])){ //이미 이름이 있는 경우
                map.put(participant[i], map.get(participant[i]) + 1);
            }else{
                map.put(participant[i], 1);
            }
        }
        //완주 선수 전부를 순회해서 hashmap에서 제거
        for(int i=0; i<completion.length; i++){
            if(map.get(completion[i]) > 0){
                map.put(completion[i], map.get(completion[i])-1);
            }
        }
        
        for(int i=0; i<length; i++){
            if(map.get(participant[i]) == 1){
                answer = participant[i];
            }
        }
       
        return answer;
    }
}