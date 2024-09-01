import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer = my_string.split(" ");
        for(int i=0; i<answer.length;i++){
            if(!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        return list;
    }
}