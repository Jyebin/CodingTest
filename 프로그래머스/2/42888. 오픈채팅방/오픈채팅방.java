import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

class Solution {
    public ArrayList solution(String[] record) {
        //닉네임 변경법 : 채팅방 나가고 새로운 닉네임으로 들어감
        //채팅방에서 닉네임 변경 -> 기존 내용도 전부 변경
        HashMap<String, String> map = new HashMap<>(); //<uid, 이름>
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<record.length; i++){
            String[] str = record[i].split(" ");
            
            if(str.length == 3){ //이름 바꾸는 경우
                String entry = str[0];
                String uid = str[1];
                String name = str[2];
                if(entry.equals("Enter") || entry.equals("Change")){
                    map.put(uid, name);
                }
            }
        }
        
        for(int i=0; i<record.length; i++){
            String[] str = record[i].split(" ");
            if(str.length < 3){
                String entry = str[0];
                String uid = str[1];
                list.add(map.get(uid) + "님이 나갔습니다.");
            }else{
                String entry = str[0];
                String uid = str[1];
                if(entry.equals("Enter")){
                   list.add(map.get(uid) + "님이 들어왔습니다.");
                }
            }
        }
        return list;
    }
}