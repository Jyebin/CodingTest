class Solution {
    public int solution(int[] num_list) {
        //처음 index : 1 
        int oddSum = 0; //홀수
        int evenSum = 0; //짝수
        for(int i=0; i<num_list.length; i++){
            if(i % 2 == 0){
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }
        if(evenSum < oddSum){
            return oddSum;
        }else{
            return evenSum;
        }
       
    }
}