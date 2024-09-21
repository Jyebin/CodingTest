import java.util.*;

class Solution {
    public ArrayList solution(int[] numlist, int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            list.add(numlist[i]);
        }
        Collections.sort(list, new Comparator<Integer>(){
           @Override
            public int compare(Integer a, Integer b){
                int diffA = Math.abs(a-n);
                int diffB = Math.abs(b-n);
                
                if(diffA == diffB){
                    //같으면 숫자가 큰 게 우선
                    return b-a;
                }
                return diffA - diffB;
            }
        });
        return list;
    }
}