import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //participant : 마라톤에 참여한 선수들의 이름
        //completion : 완주한 선수들
        //HashMap의 key를 선수 이름으로, value를 인원으로 설정
        int p = participant.length;
        int c = completion.length;
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>(); //참가자 명단을 저장할 맵
        
        for(int i=0; i<p; i++){
            if(map.containsKey(participant[i])){
                map.put(participant[i], map.get(participant[i]) + 1);
            }else{
                map.put(participant[i], 1);
            }
        }
        
        for(int i=0; i<c; i++){
            if(map.containsKey(completion[i])){ //완주자 목록에 있으면
                 map.put(completion[i], map.get(completion[i]) - 1); //1감소
            }
        }

        //완주자 명단에 없는 사람을 출력해야함
        for(int i=0; i<p; i++){
             if(map.get(participant[i]) != 0){
                answer = participant[i];
            }
        }
        return answer;
    }
}