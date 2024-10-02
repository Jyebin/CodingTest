import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        //신고당한 user를 key로, 신고 user를 map으로 -> 신고당한 user의 중복 알아서 제거
        //report : 신고자id 신고한id
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashSet<String> set;
        HashMap<String, Integer> cnt = new HashMap<>(); //처리 결과를 받은 유저
        
        for(int i=0; i<report.length; i++){
            String[] input = report[i].split(" ");
            if(!map.containsKey(input[1])){ //신고당한 기록이 없는 경우
                set = new HashSet<>(); //새로운 해시셋 만들기
            }else{
                set = map.get(input[1]); //input[1]의 map 가져오기
            }
            set.add(input[0]); //set에 신고한 유저 추가
            map.put(input[1], set); //신고당한 유저에 set 추가
        }
        
        //이제 map에서의 value값인 set 탐색
        for(Map.Entry<String, HashSet<String>> entry : map.entrySet()){
            if(entry.getValue().size() >= k){ //신고 횟수가 k 이상인 경우
                for(String s : entry.getValue()){  //값들을 하나씩 순회
                    cnt.put(s, cnt.getOrDefault(s,0)+1);
                }
            }
        }
        
        int[] answer = new int[id_list.length];
        for(int i=0; i<id_list.length; i++){
            if(cnt.containsKey(id_list[i])){
                answer[i] = cnt.get(id_list[i]);
            }else{
                answer[i] = 0;
            }
        }
        return answer;
    }
}