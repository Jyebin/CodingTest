import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        //n이하의 홀수를 담음
        //오름차순으로 정렬
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                list.add(i);
            }
        }
        return list;
    }
}