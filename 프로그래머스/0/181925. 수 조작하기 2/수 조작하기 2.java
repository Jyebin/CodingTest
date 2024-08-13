class Solution {
    public String solution(int[] numLog) {
        int len = numLog.length;
        String answer = "";
        
        for(int i=0; i<len-1; i++){
            if(numLog[i+1] - numLog[i] == 1){
                answer = answer + "w";
            }else if(numLog[i+1] - numLog[i] == -1){
                answer = answer + "s";
            }else if(numLog[i+1] - numLog[i] == 10){
                answer = answer + "d";
            }else{
                answer = answer + "a";
            }
        }
        
        return answer;
    }
}