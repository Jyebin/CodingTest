import java.util.*;

class Solution {
    public ArrayList solution(int[] answers) {
        int[] one = {1,2,3,4,5}; //5개
        int[] two = {2,1,2,3,2,4,2,5}; //8개
        int[] three = {3,3,1,1,2,2,4,4,5,5}; //10개
        int oneScore = 0;
        int twoScore = 0;
        int threeScore = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i%5]){
                oneScore ++;
            }
            if(answers[i] == two[i%8]){
                twoScore ++;
            }
            if(answers[i] == three[i%10]){
                threeScore ++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(oneScore, Math.max(twoScore, threeScore));
        if(max == oneScore){
            list.add(1);
        }
        if(max == twoScore){
            list.add(2);
        }
        if(max == threeScore){
            list.add(3);
        }
        Collections.sort(list);
        return list;
    }
}