import java.util.*;

class Solution {
    public ArrayList solution(long n) {
        String str = n + "";
        String[] nStr = str.split("");
        ArrayList<Long> list = new ArrayList<>();
        for(int i=nStr.length-1; i>=0; i--){
            list.add(Long.parseLong(nStr[i]));
        }
        return list;
    }
}