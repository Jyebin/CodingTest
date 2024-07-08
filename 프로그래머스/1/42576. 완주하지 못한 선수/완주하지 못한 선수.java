import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        int p = participant.length;
        int c = completion.length;
        //마라톤에 참여한 선수 : participant
        //완주한 선수 : completion
        //완주하지 못한 선수 return
        //HashMap을 이용하여 선수의 이름을 key값으로, 인원수를 value값으로 설정
        HashMap<String, Integer> map = new HashMap<>();
        //for문을 돌며 participant 배열에 있는 이름을 key값으로 설정
        for(int i=0; i<p; i++){ //참여한 선수 넣기
            if(map.containsKey(participant[i])){ //중복되는 값이 있으면 value + 1
                map.put(participant[i], map.get(participant[i])+1);
            }else{ //중복되는 값이 없으면 1
                map.put(participant[i],1);
            }
        }
        for(int i=0;i<c;i++){ //map에서 참여한 선수 빼기 -> 1씩 감소 하도록 update해야 함
            if(map.containsKey(completion[i])){
                map.put(completion[i], map.get(completion[i])-1);
            }
        }
        for(int i=0;i<p;i++){
            if(map.get(participant[i]) != 0){ //값이 0이 아니면 -> 사람이 한 명 이상 존재하면
                return participant[i];
            }
        }
        return null;
    }
}