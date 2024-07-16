import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        //1번 : 1,2,3,4,5 -> 5개
        //2번 : 2,1,2,3,2,4,2,5 -> 8개
        //3번 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 -> 10개
        int length = answers.length;
        int[] num1 = {1,2,3,4,5};
        int num1Result = 0;
        int[] num2 = {2,1,2,3,2,4,2,5};
        int num2Result = 0;
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int num3Result = 0;
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<length; i++){
            if(num1[i%5] == answers[i]){
                num1Result++;
            }
            if(num2[i%8] == answers[i]){
                num2Result ++;
            }
            if(num3[i%10]==answers[i]){
                num3Result ++;
            }
        }
  
        int maxResult = Math.max(num1Result, Math.max(num2Result, num3Result));
        ArrayList<Integer> result = new ArrayList<>();
        if (num1Result == maxResult) result.add(1);
        if (num2Result == maxResult) result.add(2);
        if (num3Result == maxResult) result.add(3);
        
        return result;
    }
}