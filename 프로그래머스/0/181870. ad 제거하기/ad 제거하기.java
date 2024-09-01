import java.util.*;

class Solution {
    public ArrayList solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<strArr.length; i++){
            String now = strArr[i];
            if(now.contains("ad")){
                strArr[i] = "";
            }
        }
        for(int i=0; i<strArr.length; i++){
            if(strArr[i] != ""){ //자바는 null과 ""가 다름
                list.add(strArr[i]);
            }
        }
        return list;
    }
}