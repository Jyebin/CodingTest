import java.util.*;

class Solution {
    public ArrayList solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i=0; i<record.length; i++){
            String[] input = record[i].split(" ");
            if(input[0].equals("Enter") || input[0].equals("Change")){ //우선 닉네임을 다 변경하고 나중에 출력해야 함
                map.put(input[1], input[2]);
            }
        }
            
        for(int i=0; i<record.length; i++){
            String[] input = record[i].split(" ");
            if(input[0].equals("Enter")){
                answer.add(map.get(input[1]) + "님이 들어왔습니다.");
            }else if(input[0].equals("Leave")){
                answer.add(map.get(input[1]) + "님이 나갔습니다."); 
            }
        }
        return answer;
    }
}