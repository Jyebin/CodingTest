class Solution {
    public int solution(int[] dot) {
        //1사분면 : x 양수 y 양수
        //2사분면 : x 음수 y 양수
        //3사분면 : x 음수 y 음수
        //4사분면 : x 양수 y 음수
        int answer = 0;
        if(dot[0] < 0){ //2,3
            if(dot[1] < 0){
                answer = 3;
            }else{
                answer = 2;
            }
        }else{ //1,4
            if(dot[1] < 0){
                answer = 4;
            }else{
                answer = 1;
            }
        }
        return answer;
    }
}