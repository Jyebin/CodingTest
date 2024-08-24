import java.util.*;

class Solution {
    public ArrayList solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        //1이상 n이하
        //k의 배수
        for(int i=1; i<=n; i++){
            if(i%k == 0){
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}