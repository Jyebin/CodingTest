class Solution {
    public String solution(String polynomial) {
        String[] input = polynomial.split(" ");
        int xCnt = 0; //계수
        int numCnt = 0; //상수항
        String answer = "";
        for(int i=0; i<input.length; i++){
            if(input[i].contains("x")){ //x항일 경우
                if(input[i].equals("x")){ //계수가 1일 경우
                    xCnt = xCnt + 1;
                }else{ //계수가 붙은 경우 -> 계수가 두개인 경우도 생각해야함
                    input[i] = input[i].replace("x", "");
                    xCnt += Integer.parseInt(input[i]);
                }
            }else if(Character.isDigit(input[i].charAt(0))){
                numCnt += Integer.parseInt(input[i]);
            }
        }
        
        if (numCnt > 0 && xCnt > 0) {
            if(xCnt == 1){
                answer = "x" + " + " + numCnt;
            }else{
                answer = xCnt + "x" + " + " + numCnt;
            }
        } else if (numCnt <= 0 && xCnt > 0) {
            if(xCnt == 1){
                answer = "x";
            }else{
                answer = xCnt + "x";
            }
        } else if (numCnt > 0 && xCnt <= 0) {
            answer = numCnt + "";
        } 
        return answer;
    }
}