import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){ //만약 숫자면
                list.add(my_string.charAt(i) - '0');
            }
        }
        Collections.sort(list);
        return list;
    }
}