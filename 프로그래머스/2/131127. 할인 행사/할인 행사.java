import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        //할인제품은 하루에 하나씩만 구매
        //원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 맞춰서 회원가입
        //해시맵에 우선 넣어두고, 배열을 탐색하면서 있는지 없는지 보기
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<want.length; i++){
            if(map.containsKey(want[i])){
                map.put(want[i], map.get(want[i] + number[i]));
            }else{
                map.put(want[i], number[i]);
            }
        }
        
        int answer = 0;
        return answer;
    }
}