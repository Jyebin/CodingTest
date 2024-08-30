import java.util.*;

class Solution {
    public ArrayList solution(String[] names) {
        ArrayList<String> list = new ArrayList<>();
        //앞에서부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 list
        for(int i=0; i<names.length; i+=5){
            list.add(names[i]);
        }
        return list;
    }
}