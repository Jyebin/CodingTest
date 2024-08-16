class Solution {
    public String solution(String rsp) {
        //가위 : 2 -> 바위여야 이김
        //바위 : 0 -> 보여야 이김
        //보 : 5 -> 가위여야 이김
        String[] input = rsp.split("");
        int len = input.length;
        int[] rps = new int[len];
        
        for(int i=0; i<len; i++){
            rps[i] = Integer.parseInt(input[i]);
        }
        String answer = "";
        for(int i=0; i<len; i++){
            if(rps[i] == 2){
                answer = answer + "0";
            }else if(rps[i] == 0){
                answer = answer + "5";
            }else{
                answer = answer + "2";
            }
        }
        return answer;
    }
}