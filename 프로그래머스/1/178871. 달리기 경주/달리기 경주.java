import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        //map에다가 플레이어 이름과 등수를 저장
        int j = 0;
        for(String name : players){
            map.put(name, j);
            j++;
        }
        //calling를 하나씩 꺼내오면서 players를 바꾸기
        for(int i=0; i<callings.length; i++){
            String name = callings[i]; //불린 사람
            int idx = map.get(name); //불린 사람의 등수
            String front = players[idx-1]; //불린 사람 앞사람
            
            //자리 바꾸기
            players[idx] = front;
            players[idx-1] = name;
            
            map.put(name, idx-1);
            map.put(front, idx);
        }

        return players;
    }
}