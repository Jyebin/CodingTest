import java.util.*;

class Solution {
    public ArrayList solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<answer.length; i++){
            if(!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        //사전순 정렬
        Collections.sort(list);
        return list;
    }
}