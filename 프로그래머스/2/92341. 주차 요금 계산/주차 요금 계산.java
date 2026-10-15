import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        int defaultFee = fees[1];
        int defaultTime = fees[0];
        int unitTime = fees[2];
        int unitFee = fees[3];
        HashMap<String, Integer> inTime = new HashMap<>(); //입차 시간
        TreeMap<String, Integer> totalTime = new TreeMap<>(); //누적 시간
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<records.length; i++){
            String[] str = records[i].split(" ");
            String[] min = str[0].split(":");
            
            //str[0]=시각
            //str[1]=차량번호
            //str[2]=입출차 내역
            if(str[2].equals("IN")){
                inTime.put(str[1], Integer.parseInt(min[0]) * 60 + Integer.parseInt(min[1]));
                set.add(str[1]);
            }else if(str[2].equals("OUT") && set.contains(str[1])){ //OUT이고 set에 있으면
                set.remove(str[1]); //해당하는 차 번호를 지우고
                int now = Integer.parseInt(min[0]) * 60 + Integer.parseInt(min[1]);
                int stay = now - inTime.get(str[1]);
                totalTime.put(str[1], totalTime.getOrDefault(str[1], 0) + stay);   
            }
            
        }
        if(!set.isEmpty()){
            for(String s : set){
                totalTime.put(s, totalTime.getOrDefault(s, 0) + 23*60 + 59 - inTime.get(s));
            }
        }
        
        int[] answer = new int[totalTime.size()];
        //TreeMap을 써서 정렬은 필요 없음, 요금조건만 맞추면 됨
        int i = 0;
        for(String s : totalTime.keySet()){
            int time = 0;
            if(totalTime.get(s) <= defaultTime){
                time = defaultFee;
            }else{
                time = defaultFee + (int)Math.ceil((double)(totalTime.get(s) - defaultTime)/unitTime) * unitFee;
            }
            answer[i] = time;
            i++;
        }
        
        return answer;
    }
}