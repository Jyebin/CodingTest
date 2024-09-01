import java.util.*;

class Solution {
    public ArrayList solution(int n, int[] numlist) {
    //n의 배수가 아닌 수들 제거
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n != 0){
                numlist[i] = -1;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] != -1){
                list.add(numlist[i]);
            }
        }
        return list;
    }
}