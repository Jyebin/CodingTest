import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        int len = my_string.length();
        ArrayList<String> list = new ArrayList<>();
        //접미사 : 특정 인덱스부터 시작하는 문자열
        for(int i=0; i<len; i++){
            list.add(my_string.substring(i));
        }
        Collections.sort(list);
        return list;
    }
}